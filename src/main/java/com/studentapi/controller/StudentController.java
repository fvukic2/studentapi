package com.studentapi.controller;

import com.studentapi.domain.entity.Student;
import com.studentapi.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping()
    private List<Student> getAllStudents(Student student){
        return studentService.getAllStudent();
    }

    @PostMapping()
    private void saveNewStudent(@RequestBody Student student){
        studentService.saveNewStudent(student);
    }

    @PutMapping()
    private void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    private void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }
}
