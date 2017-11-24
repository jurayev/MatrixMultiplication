package kz.epam.tam.module3.matrixmultiplication.utils;

import kz.epam.tam.module3.matrixmultiplication.core.Matrix;

public class MatrixMultiplicator {

    public static int[][] multMatrices(int[][]matrixA,int[][]matrixB){
        Matrix matrix;
        int rA = matrixA.length;
        if (rA == 0){
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
    }
}
