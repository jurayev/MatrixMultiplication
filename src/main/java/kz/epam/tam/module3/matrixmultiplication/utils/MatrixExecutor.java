package kz.epam.tam.module3.matrixmultiplication.utils;

public class MatrixExecutor {

    public static void multiplicateMatrices(){
        MatrixFiller filler = new MatrixFiller();
        MatrixMultiplicator multiplicator = new MatrixMultiplicator();
        MatrixPrinter printer = new MatrixPrinter();
        int [][] matrixA = MatrixFiller.fillMatrix();
        int [][] matrixB = MatrixFiller.fillMatrix();
        int [][] matrixC = MatrixMultiplicator.multMatrices(matrixA,matrixB);
            if(matrixC != null) {
                MatrixPrinter.printMatrix(matrixA);
                MatrixPrinter.printMatrix(matrixB);
                MatrixPrinter.printMatrix(matrixC);
        }
            else{
                MatrixPrinter.printDimensionError();
                MatrixPrinter.printMatrix(matrixA);
                MatrixPrinter.printMatrix(matrixB);
        }
    }
}
