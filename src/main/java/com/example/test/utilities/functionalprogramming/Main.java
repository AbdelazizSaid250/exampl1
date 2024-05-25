package com.example.test.utilities.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static com.example.test.utilities.functionalprogramming.Student.getStudentInfo;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = list.stream()
                .filter(Calculator::isOdd)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(result);


        int res1 = processFunction(Calculator::addWithOne, 8);
        System.out.println("res1 = " + res1);

        int res2 = processFunction(Calculator::multiply, 8);
        System.out.println("res2 = " + res2);

        int res3 = processFunction(Calculator::subtractWithOne, 8);
        System.out.println("res3 = " + res3);

        int res4 = processBiFunction(Calculator::add, 3, 2);
        System.out.println("res5 = " + res4);

        int res5 = processBiFunction(Calculator::multiply, 3, 2);
        System.out.println("res5 = " + res5);

        Student student = new Student("Ibrahim", "AlKholy  ", 30, "ibrahim@gmail.com");

        String studentEmail = getStudentInfo(Student::getStudentEmail, student);
        System.out.println("studentName = " + studentEmail);

        String studentName = getStudentInfo(Student::getStudentName, student);
        System.out.println("studentName = " + studentName);

    }

    public static Integer processFunction(Function<Integer, Integer> function, int num) {
        return function.apply(num);
    }


    public static Integer processBiFunction(BiFunction<Integer, Integer, Integer> function, int num1, int num2) {
        return function.apply(num1, num2);
    }


}
