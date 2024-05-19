package com.example.test.controller;

import com.example.test.model.dto.StudentDto;
import com.example.test.repositories.StudentListRepository;
import com.example.test.repositories.StudentMapRepository;
import com.example.test.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


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

    @GetMapping("requestParam")
    public ResponseEntity<String> requestParam(@RequestParam String name, @RequestParam Integer age) {
        return ResponseEntity.ok("Student Name = " + name + ", age = " + age);
    }

    @GetMapping("getCustomStudentForNameAndAge")
    public StudentDto getCustomStudentWithNameAndAge() {
        return studentService.getStudentForNameAndAge();
    }

    @GetMapping("getCustomStudentForAge")
    public ResponseEntity<StudentDto> getCustomStudentWithAge() {
        return ResponseEntity.ok(studentService.getStudentForAge());
    }


}
