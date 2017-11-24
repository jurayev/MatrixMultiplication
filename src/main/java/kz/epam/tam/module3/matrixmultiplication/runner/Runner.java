package kz.epam.tam.module3.matrixmultiplication.runner;

import kz.epam.tam.module3.matrixmultiplication.workflow.MatrixExecutor;

public class Runner {
    public static void main (String[] arg) {

        MatrixExecutor executor = new MatrixExecutor();
        executor.multiplicateMatrices();
    }
}

