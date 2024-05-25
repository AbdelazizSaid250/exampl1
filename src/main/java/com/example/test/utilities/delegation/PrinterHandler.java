package com.example.test.utilities.delegation;

/**
 * This class is a delegator class
 *
 * @author Abdelaziz Said
 */
public class PrinterHandler {

    private final Printer printer;

    public PrinterHandler(Printer printer) {
        this.printer = printer;
    }

    public void print(String message) {
        printer.print(message);
    }
}
