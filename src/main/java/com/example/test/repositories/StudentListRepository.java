package com.example.test.repositories;

import com.example.test.model.dto.StudentDto;

import java.util.ArrayList;
import java.util.List;

public class StudentListRepository {

    // Shared Resource
    // Eager Instantiation
//    private static final List<StudentDto> studentDtoList = new ArrayList<>();

    // Shared Resource
    // Lazy Instantiation
    private static List<StudentDto> instance;

    private StudentListRepository() {
    }

    public static List<StudentDto> getInstance() {
        if (instance == null) {
            synchronized (StudentListRepository.class) {
                if (instance == null) {
                    instance = new ArrayList<>();
                }
            }
        }
        return instance;
    }
}
