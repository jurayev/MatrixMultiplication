package kz.epam.tam.module3.matrixmultiplication.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardReaderMatrix {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInt() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                MatrixPrinter.printValueError();
                scanner.nextLine();
            }
        }
    }
}

