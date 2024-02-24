package com.student.stu.service;

import com.student.stu.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentByName(String name); // Changed method name to getStudentByName
    Student addStudent(Student student);
    void deleteStudent(String id);
}
