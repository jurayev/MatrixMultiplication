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
    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrixValues(int r,int e,int c) {
        this.matrix[rows = r][columns = e] = c;
    }


/*
    public int[][] createMatrix(){
        return new int[rows][columns];
    }*/

}
