package com.example.test.service;

import com.example.test.model.dto.StudentDto;
import com.example.test.repositories.StudentMapRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;


// No need to use it
@Service
public class StudentService {

    private Map<Integer, StudentDto> studentDtoMap;

    @Value("${student.name}")
    private String propertiesName;

    @Value("${student.age}")
    private Integer propertiesAge;


    public StudentDto getStudentForNameAndAge() {
        studentDtoMap = StudentMapRepository.getInstance();
        return studentDtoMap.values()
                .stream()
                .filter(studentDto -> studentDto.getName().equalsIgnoreCase(propertiesName) && studentDto.getAge() > propertiesAge)
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    // Not best practice to return empty value without handling the error!!
    public StudentDto getStudentForAge() {
        studentDtoMap = StudentMapRepository.getInstance();
        return studentDtoMap.values()
                .stream()
                .filter(studentDto -> studentDto.getAge() > propertiesAge)
                .findFirst()
                .orElse(new StudentDto());
    }

}
