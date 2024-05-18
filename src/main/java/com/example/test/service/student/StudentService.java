package com.example.test.service.student;

import com.example.test.model.dto.StudentDto;

public interface StudentService {

    StudentDto getStudentForNameAndAge();

    StudentDto getStudentForAge();
}
