package com.example.test.utilities.functionalprogramming;

public class Calculator {

    public static int addWithOne(int num) {
        return num + 1;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtractWithOne(int num) {
        return num - 1;
    }

    public static int multiply(int num) {
        return num * num;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }



    public static boolean isEven(Integer element) {
        return element % 2 == 0;
    }

    public static boolean isOdd(Integer element) {
        return element % 2 != 0;
    }
}
