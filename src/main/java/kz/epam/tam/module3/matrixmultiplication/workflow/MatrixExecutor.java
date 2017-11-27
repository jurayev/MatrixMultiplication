package kz.epam.tam.module3.matrixmultiplication.workflow;

import kz.epam.tam.module3.matrixmultiplication.core.Matrix;
import kz.epam.tam.module3.matrixmultiplication.utils.MatrixFiller;
import kz.epam.tam.module3.matrixmultiplication.utils.MatrixMultiplicator;
import kz.epam.tam.module3.matrixmultiplication.utils.MatrixPrinter;

public class MatrixExecutor {

    public void multiplicateMatrices(){
        Matrix matrixA = MatrixFiller.fillMatrix();
        Matrix matrixB = MatrixFiller.fillMatrix();
        Matrix matrixC = MatrixMultiplicator.multMatrices(matrixA,matrixB);
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
