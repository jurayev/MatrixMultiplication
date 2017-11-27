package kz.epam.tam.module3.matrixmultiplication.utils;

import kz.epam.tam.module3.matrixmultiplication.core.Matrix;

public class MatrixMultiplicator {
    public static Matrix multMatrices(Matrix matrixA,Matrix matrixB){
        Matrix matrixC;
        int rA = matrixA.getMatrix().length;
        if (rA == 0 || matrixB.getMatrix().length == 0){
            matrixC = new Matrix(0, 0);
            return matrixC;
        }
        int eA = matrixA.getMatrix()[0].length;
        if (eA != matrixB.getMatrix().length){
            return null;
        }
        int eB = matrixB.getMatrix()[0].length;
        matrixC = new Matrix(rA, eB);
        ///int[][] result = matrix.createMatrix();
        for (int r = 0; r < rA; r++) {
            for (int c = 0; c < eB; c++) {
                for (int k = 0; k < eA; k++) {
                    matrixC.getMatrix()[r][c] = matrixC.getMatrix()[r][c]  + matrixA.getMatrix()[r][k] * matrixB.getMatrix()[k][c];
                }
            }
        }
        return matrixC;
    }

    /*public static int[][] multMatrices(int[][]matrixA,int[][]matrixB){
        Matrix matrix;
        int rA = matrixA.length;
        if (rA == 0 || matrixB.length == 0){
             matrix = new Matrix(0, 0);
             return matrix.createMatrix();
        }
        int eA = matrixA[0].length;
        if (eA != matrixB.length){
            return null;
        }
        int eB = matrixB[0].length;
        matrix = new Matrix(rA, eB);
        int[][] result = matrix.createMatrix();
        for (int r = 0; r < rA; r++) {
            for (int c = 0; c < eB; c++) {
                for (int k = 0; k < eA; k++) {
                    result[r][c] = result[r][c] + matrixA[r][k] * matrixB[k][c];
                }
            }
        }
        return result;
    }*/
}
