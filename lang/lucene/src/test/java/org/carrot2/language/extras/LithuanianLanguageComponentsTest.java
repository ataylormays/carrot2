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
package org.carrot2.language.extras;

import java.io.IOException;

public class LithuanianLanguageComponentsTest extends AbstractLanguageComponentsTest {
  public LithuanianLanguageComponentsTest() throws IOException {
    super(
        LithuanianLanguageComponents.NAME,
        new String[] {"jųdviejų", "jiedviem"},
        new String[][] {
          {"brolį", "brol"},
          {"arkliams", "arkliam"},
        });
  }
}
