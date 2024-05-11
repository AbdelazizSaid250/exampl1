package com.example.test.repository;

import com.example.test.model.dto.StudentDto;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    // Shared Resource
    // Eager Instantiation
//    private static final List<StudentDto> studentDtoList = new ArrayList<>();

    // Shared Resource
    // Lazy Instantiation
    private static List<StudentDto> instance;

    private StudentRepository() {
    }

    public static List<StudentDto> getInstance() {
        if (instance == null) {
            synchronized (StudentRepository.class) {
                if (instance == null) {
                    instance = new ArrayList<>();
                }
            }
        }
        return instance;
    }
}
