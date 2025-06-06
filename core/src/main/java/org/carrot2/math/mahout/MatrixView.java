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
package org.carrot2.math.mahout;

public class MatrixView extends AbstractMatrix {

  private Matrix matrix;

  // the offset into the Matrix
  private int[] offset;

  public MatrixView(Matrix matrix, int[] offset, int[] size) {
    super(size[ROW], size[COL]);
    int rowOffset = offset[ROW];
    if (rowOffset < 0) {
      throw new IndexException(rowOffset, rowSize());
    }

    int rowsRequested = size[ROW];
    if (rowOffset + rowsRequested > matrix.rowSize()) {
      throw new IndexException(rowOffset + rowsRequested, matrix.rowSize());
    }

    int columnOffset = offset[COL];
    if (columnOffset < 0) {
      throw new IndexException(columnOffset, columnSize());
    }

    int columnsRequested = size[COL];
    if (columnOffset + columnsRequested > matrix.columnSize()) {
      throw new IndexException(columnOffset + columnsRequested, matrix.columnSize());
    }
    this.matrix = matrix;
    this.offset = offset;
  }

  @Override
  public Matrix clone() {
    MatrixView clone = (MatrixView) super.clone();
    clone.matrix = matrix.clone();
    clone.offset = offset.clone();
    return clone;
  }

  @Override
  public double getQuick(int row, int column) {
    return matrix.getQuick(offset[ROW] + row, offset[COL] + column);
  }

  @Override
  public Matrix like() {
    return matrix.like(rowSize(), columnSize());
  }

  @Override
  public Matrix like(int rows, int columns) {
    return matrix.like(rows, columns);
  }

  @Override
  public void setQuick(int row, int column, double value) {
    matrix.setQuick(offset[ROW] + row, offset[COL] + column, value);
  }

  @Override
  public int[] getNumNondefaultElements() {
    return new int[] {rowSize(), columnSize()};
  }

  @Override
  public Matrix viewPart(int[] offset, int[] size) {
    if (offset[ROW] < ROW) {
      throw new IndexException(offset[ROW], ROW);
    }
    if (offset[ROW] + size[ROW] > rowSize()) {
      throw new IndexException(offset[ROW] + size[ROW], rowSize());
    }
    if (offset[COL] < ROW) {
      throw new IndexException(offset[COL], ROW);
    }
    if (offset[COL] + size[COL] > columnSize()) {
      throw new IndexException(offset[COL] + size[COL], columnSize());
    }
    int[] origin = offset.clone();
    origin[ROW] += offset[ROW];
    origin[COL] += offset[COL];
    return new MatrixView(matrix, origin, size);
  }

  @Override
  public Matrix assignColumn(int column, Vector other) {
    if (rowSize() != other.size()) {
      throw new CardinalityException(rowSize(), other.size());
    }
    for (int row = 0; row < rowSize(); row++) {
      matrix.setQuick(row + offset[ROW], column + offset[COL], other.getQuick(row));
    }
    return this;
  }

  @Override
  public Matrix assignRow(int row, Vector other) {
    if (columnSize() != other.size()) {
      throw new CardinalityException(columnSize(), other.size());
    }
    for (int col = 0; col < columnSize(); col++) {
      matrix.setQuick(row + offset[ROW], col + offset[COL], other.getQuick(col));
    }
    return this;
  }

  @Override
  public Vector viewColumn(int column) {
    if (column < 0 || column >= columnSize()) {
      throw new IndexException(column, columnSize());
    }
    return new VectorView(matrix.viewColumn(column + offset[COL]), offset[ROW], rowSize());
  }

  @Override
  public Vector viewRow(int row) {
    if (row < 0 || row >= rowSize()) {
      throw new IndexException(row, rowSize());
    }
    return new VectorView(matrix.viewRow(row + offset[ROW]), offset[COL], columnSize());
  }
}
