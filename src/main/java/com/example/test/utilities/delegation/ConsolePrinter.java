package com.example.test.utilities.delegation;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Printing: " + message + " to console!!");
    }
}
