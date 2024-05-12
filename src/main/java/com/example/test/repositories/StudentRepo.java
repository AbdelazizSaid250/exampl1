package com.example.test.repositories;

import com.example.test.model.dto.StudentDto;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {

    private StudentRepo() {
    }

    public class InnerClass {
        private static final StudentRepo INSTANCE = new StudentRepo();
    }

    public static StudentRepo getInstance() {
        return InnerClass.INSTANCE;
    }

    private final List<StudentDto> studentDtoList = new ArrayList<>();

    public List<StudentDto> getStudentDtoList() {
        return studentDtoList;
    }

    public void add(StudentDto studentDto) {
        studentDtoList.add(studentDto);
    }
}
