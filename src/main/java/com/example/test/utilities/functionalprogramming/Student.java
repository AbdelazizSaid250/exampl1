package com.example.test.utilities.functionalprogramming;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.function.Function;

@Data
@AllArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String email;


    public static String getStudentInfo(Function<Student, String> function, Student student) {
        return function.apply(student);
    }

    public static String getStudentName(Student student) {
        return student.getFirstName().trim() + " " + student.getLastName().trim();
    }

    public static String getStudentEmail(Student student) {
        if (student.getEmail().contains("@")) {
            return student.getEmail();
        } else {
            return "";
        }
    }
}
