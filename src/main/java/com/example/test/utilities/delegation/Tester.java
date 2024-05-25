package com.example.test.utilities.delegation;

public class Tester {
    public static void main(String[] args) {
        String message = "Hello World!";
        Printer filePrinter = new FilePrinter();
        Printer consolePrinter = new ConsolePrinter();
        Printer realPrinter = new RealPrinter();

        Printer anonymousPrinter = message1 -> System.out.println("Printing: " + message1 + " to Web Page!!");

        PrinterHandler handler = new PrinterHandler(anonymousPrinter);
        handler.print(message);
    }
}
