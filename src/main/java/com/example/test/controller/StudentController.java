package com.example.test.controller;

import com.example.test.model.dto.StudentDto;
import com.example.test.repository.StudentRepo;
import com.example.test.repository.StudentRepository;
import com.example.test.repository.StudentRepositorySingleton;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("student")
public class StudentController {

    @PostMapping("save")
    public void saveStudentApi(@RequestBody StudentDto studentDto) {
//        StudentRepository.getInstance().add(studentDto);
        StudentRepositorySingleton instance = StudentRepositorySingleton.INSTANCE;
        instance.add(studentDto);
    }

    @GetMapping("numOfStudents")
    public Integer findStudentLength() {
//        List<StudentDto> studentDtoList = StudentRepository.getInstance();
//        return studentDtoList.size();
        StudentRepositorySingleton instance = StudentRepositorySingleton.INSTANCE;
        return instance.getStudentDtoList().size();
    }


}
