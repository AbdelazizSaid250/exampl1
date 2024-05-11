package com.example.test.repository;

import com.example.test.model.dto.StudentDto;

import java.util.ArrayList;
import java.util.List;

public enum StudentRepositorySingleton {
    INSTANCE;

    private final List<StudentDto> studentDtoList = new ArrayList<>();

    public List<StudentDto> getStudentDtoList() {
        return studentDtoList;
    }

    public void add(StudentDto studentDto) {
        studentDtoList.add(studentDto);
    }
}
