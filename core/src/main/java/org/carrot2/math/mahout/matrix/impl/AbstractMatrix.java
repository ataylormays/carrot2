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
package org.carrot2.math.mahout.matrix.impl;

public abstract class AbstractMatrix {

  protected boolean isNoView = true;

  protected AbstractMatrix() {}

  public void ensureCapacity(int minNonZeros) {}

  public abstract int size();
}
