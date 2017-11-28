package kz.epam.tam.module3.matrixmultiplication.core;

public class Matrix {
    private int rows;
    private int columns;
    private int[][] matrix;

    public Matrix(int rows,int columns){
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[this.rows][this.columns];
    }
    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }
    public int getMatrixValues(int r, int c) {
        return matrix[r][c];
    }

    public void setMatrixValues(int r,int c,int value) {
        this.matrix[r][c] = value;
    }
}
