package com.example.test.utilities.delegation;

public class RealPrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println("Printing: " + message + " to Real Paper!!");
    }
}
