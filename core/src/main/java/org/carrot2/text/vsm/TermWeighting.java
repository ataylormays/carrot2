/*
 * Carrot2 project.
 *
 * Copyright (C) 2002-2025, Dawid Weiss, Stanisław Osiński.
 * All rights reserved.
 *
 * Refer to the full license file "carrot2.LICENSE"
 * in the root folder of the repository checkout or at:
 * https://www.carrot2.org/carrot2.LICENSE
 */
package org.carrot2.text.vsm;

import org.carrot2.attrs.AcceptingVisitor;

/**
 * Calculates term weights for the term-document matrix.
 *
 * @see TermDocumentMatrixBuilder
 */
public interface TermWeighting extends AcceptingVisitor {
  /**
   * Calculates the weight of a term for a single document.
   *
   * @param termFrequency frequency of the term in the document
   * @param documentFrequency the number of documents containing the term
   * @param documentCount total number of documents
   */
  double calculateTermWeight(int termFrequency, int documentFrequency, int documentCount);
}
