package kz.epam.tam.module3.matrixmultiplication.utils;

import kz.epam.tam.module3.matrixmultiplication.core.Matrix;

public class MatrixMultiplicator {

    public static Matrix multMatrices(Matrix matrixA,Matrix matrixB){
        Matrix matrixC;
        int rA = matrixA.getRows();
        if (rA == 0 || matrixB.getRows() == 0){
            matrixC = new Matrix(0, 0);
            return matrixC;
        }
        int eA = matrixA.getColumns();
        if (eA != matrixB.getRows()){
            return null;
        }
        int eB = matrixB.getColumns();
        matrixC = new Matrix(rA, eB);
        for (int r = 0; r < rA; r++) {
            for (int c = 0; c < eB; c++) {
                for (int k = 0; k < eA; k++) {
                   int value = matrixC.getMatrixValues(r,c) + matrixA.getMatrixValues(r,k) * matrixB.getMatrixValues(k,c);
                   matrixC.setMatrixValues(r,c,value);
                }
            }
        }
        return matrixC;
    }
}
