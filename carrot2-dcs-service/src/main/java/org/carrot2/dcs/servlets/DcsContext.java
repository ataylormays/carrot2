package org.carrot2.dcs.servlets;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.carrot2.clustering.ClusteringAlgorithmProvider;
import org.carrot2.dcs.client.ClusterRequest;
import org.carrot2.language.LanguageComponents;
import org.carrot2.util.ResourceLookup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

class DcsContext {
  public static final String PARAM_RESOURCES = "resources";
  public static final String PARAM_TEMPLATES = "templates";

  private static String KEY = "_dcs_";
  private static Logger log = LoggerFactory.getLogger(DcsContext.class);

  final ObjectMapper om;
  final Map<String, ClusterRequest> templates;
  final Map<String, ClusteringAlgorithmProvider> algorithmSuppliers;
  final Map<String, LanguageComponents> languages;

  private DcsContext(ServletContext servletContext) throws ServletException {
    this.om = new ObjectMapper();
    om.configure(JsonParser.Feature.ALLOW_COMMENTS, true);

    this.templates = processTemplates(om, servletContext);
    this.algorithmSuppliers =
        StreamSupport.stream(ServiceLoader.load(ClusteringAlgorithmProvider.class).spliterator(), false)
            .collect(Collectors.toMap(e -> e.name(), e -> e));

    // Load lexical resources.
    String resourcePath = servletContext.getInitParameter(PARAM_RESOURCES);
    if (resourcePath != null && !resourcePath.trim().isEmpty()) {
      ResourceLookup contextLookup = new ServletContextLookup(servletContext, resourcePath);
      log.info("Loading language resources from: " + resourcePath);
      this.languages = new LinkedHashMap<>();
      for (String lang : LanguageComponents.languages()) {
        try {
          languages.put(lang, LanguageComponents.load(lang, contextLookup));
        } catch (IOException e) {
          throw new ServletException(
              String.format(Locale.ROOT, "Could not load the required resource for language '%s'.", lang), e);
        }
      }
    } else {
      log.info("Loading language resources from default classpath locations.");
      // Load default.
      this.languages = LanguageComponents.languages().stream()
          .collect(Collectors.toMap(
              e -> e,
              e -> LanguageComponents.load(e)));
    }

    log.info("DCS context initialized [algorithms: {}, templates: {}]",
        algorithmSuppliers.keySet(),
        templates.keySet());
  }

  public synchronized static DcsContext load(ServletContext servletContext) throws ServletException {
    DcsContext context = (DcsContext) servletContext.getAttribute(KEY);
    if (context == null) {
      context = new DcsContext(servletContext);
      servletContext.setAttribute(KEY, context);
    }
    return context;
  }

  private Map<String, ClusterRequest> processTemplates(ObjectMapper om, ServletContext servletContext) throws ServletException {
    String templatePath = servletContext.getInitParameter(PARAM_TEMPLATES);
    if (templatePath == null || templatePath.isEmpty()) {
      log.warn("Template path init parameter is empty.");
      return Collections.emptyMap();
    }

    Map<String, ClusterRequest> templates = new LinkedHashMap<>();
    Set<String> resourcePaths = servletContext.getResourcePaths(templatePath);
    if (resourcePaths != null) {
      resourcePaths = new TreeSet<>(resourcePaths);
      for (String template : resourcePaths) {
        if (template.toLowerCase(Locale.ROOT).endsWith(".json")) {
          try {
            ClusterRequest requestTemplate =
                om.readValue(servletContext.getResourceAsStream(template), ClusterRequest.class);
            if (requestTemplate.documents != null && !requestTemplate.documents.isEmpty()) {
              log.warn("Templates should not contain any documents, but this template does: {}", template);
              requestTemplate.documents = null;
            }
            String id = template.substring(0, template.lastIndexOf('.'));
            id = id.substring(id.lastIndexOf('/') + 1);
            templates.put(id, requestTemplate);
          } catch (IOException e) {
            throw new ServletException("Could not process request template: " + template);
          }
        } else {
          log.debug("Ignoring non-template file (must end in *.json): {}", template);
        }
      }
    }
    return templates;
  }
}
