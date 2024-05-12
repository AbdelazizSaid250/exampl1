package com.example.test.controller;

import com.example.test.model.dto.StudentDto;
import com.example.test.repositories.StudentListRepository;
import com.example.test.repositories.StudentMapRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("student")
public class StudentController {

    @Value("${student.name}")
    private String propertiesName;

    @Value("${student.age}")
    private Integer propertiesAge;

    @PostMapping("save")
    public void saveStudentApi(@RequestBody StudentDto studentDto) {

//        StudentRepositorySingleton instance = StudentRepositorySingleton.INSTANCE;
//        instance.add(studentDto);
        StudentListRepository.getInstance().add(studentDto);
        StudentMapRepository.getInstance().put(studentDto.getId(), studentDto);
    }

    @GetMapping("numOfStudents")
    public Integer findStudentLength() {
//        List<StudentDto> studentDtoList = StudentListRepository.getInstance();
//        return studentDtoList.size();
//        StudentRepositorySingleton instance = StudentRepositorySingleton.INSTANCE;
//        return instance.getStudentDtoList().size();

        Map<Integer, StudentDto> studentDtoMap = StudentMapRepository.getInstance();
        return studentDtoMap.size();
    }

    @GetMapping("findInList/{id}")
    public StudentDto findStudentByIdInListApi(@PathVariable Integer id) {
        List<StudentDto> students = StudentListRepository.getInstance();

        /*Optional<StudentDto> optionalStudentDto = students.stream().filter(student -> student.getId() == id).findFirst();
        if (optionalStudentDto.isPresent()) {
            return optionalStudentDto.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student not found");
        }*/
        List<StudentDto> filteredStudents  = students.stream().filter(student -> student.getId() == id).toList();
        if (!filteredStudents.isEmpty()) {
            return filteredStudents.get(0);
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @GetMapping("findInMap/{id}")
    public StudentDto findStudentByIdInMapApi(@PathVariable Integer id) {
        Map<Integer, StudentDto> studentDtoMap = StudentMapRepository.getInstance();
        return studentDtoMap.get(id);
    }

    @GetMapping("findAll")
    public List<StudentDto> findAllApi() {
        Map<Integer, StudentDto> studentDtoMap = StudentMapRepository.getInstance();
        return studentDtoMap.values().stream().toList();
    }

    @PutMapping("update")
    public void updateStudentApi(@RequestBody StudentDto studentDto) {
        Map<Integer, StudentDto> studentDtoMap = StudentMapRepository.getInstance();
        studentDtoMap.put(studentDto.getId(), studentDto);
    }

    @GetMapping("getFromApplicationProperties")
    public String getFromApplicationProperties() {
        return "Student Name = " + propertiesName + ", age = " + propertiesAge;
    }
}
