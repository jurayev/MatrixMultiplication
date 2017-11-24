package kz.epam.tam.module3.matrixmultiplication.utils;

import kz.epam.tam.module3.matrixmultiplication.core.Matrix;

public class MatrixFiller {


    public static int[][] fillMatrix() {
        MatrixPrinter.printFillMatrixStepInfo("rows");
        int r = KeyboardReaderMatrix.readInt();
        MatrixPrinter.printFillMatrixStepInfo("elements(columns)");
        int e = KeyboardReaderMatrix.readInt();
        Matrix mtrx = new Matrix(r,e);
        int[][] matrix = mtrx.createMatrix();
        for (int i = 0; i < r; i++) {
            MatrixPrinter.printFillRowStepInfo();
            for (int j = 0; j < e; j++) {
                matrix[i][j] = KeyboardReaderMatrix.readInt();
            }
        }
        return matrix;
    }
}