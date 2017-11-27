package kz.epam.tam.module3.matrixmultiplication.utils;

import kz.epam.tam.module3.matrixmultiplication.core.Matrix;

public class MatrixPrinter {

    public static void printMatrix(Matrix matrix) {
        if (matrix.getMatrix().length != 0) {
            int rows = matrix.getMatrix().length;
            int elements = matrix.getMatrix()[0].length;
            System.out.println("Matrix [" + rows + "][" + elements + "]: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < elements; j++) {
                    System.out.print(matrix.getMatrix()[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Matrix [0][0]:");
        }
    }
    static void printValueError(){
        System.out.println("Incorrect value! Please, try again.");
    }
    public static void printDimensionError(){
        System.out.println("Invalid dimension of:");
    }
    static void printFillMatrixStepInfo(String text){
        System.out.println("Please enter number of Matrix "+ text);
    }
    static void printFillRowStepInfo(){
        System.out.println("Please enter elements for the row");
    }

}
