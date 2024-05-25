package com.example.test.service.student;

import com.example.test.error.exception.StudentNotFoundException;
import com.example.test.model.dto.StudentDto;
import com.example.test.repositories.StudentMapRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    private Map<Integer, StudentDto> studentRepository;

    @Value("${student.name}")
    private String propertiesName;

    @Value("${student.age}")
    private Integer propertiesAge;


    public StudentDto getStudentForNameAndAge() {
        studentRepository = StudentMapRepository.getInstance();
        return studentRepository.values()
                .stream()
                .filter(studentDto -> studentDto.getName().equalsIgnoreCase(propertiesName) && studentDto.getAge() > propertiesAge)
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Could not find student with name: " + propertiesName + " and age: " + propertiesAge + " in the Repository Layer!!"));
    }

    // Not best practice to return empty value without handling the error!!
    public StudentDto getStudentForAge() {
        studentRepository = StudentMapRepository.getInstance();
        return studentRepository.values()
                .stream()
                .filter(studentDto -> studentDto.getAge() > propertiesAge)
                .findFirst()
                .orElse(new StudentDto());
    }
}
