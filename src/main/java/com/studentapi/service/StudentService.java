package com.studentapi.service;

import com.studentapi.domain.entity.Student;

import java.util.List;

public interface StudentService {

    void saveNewStudent(Student student);

    List<Student> getAllStudent();

    void deleteStudent(Integer id);

    void updateStudent(Student student);
}
