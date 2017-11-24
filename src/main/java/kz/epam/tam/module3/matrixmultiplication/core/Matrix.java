package kz.epam.tam.module3.matrixmultiplication.core;

public class Matrix {

    private int rows;
    private int columns;

    public Matrix(int rows,int columns){
        this.rows = rows;
        this.columns = columns;
    }

    public int[][] createMatrix(){
        return new int[rows][columns];
    }

}
