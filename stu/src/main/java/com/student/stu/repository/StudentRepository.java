package com.student.stu.repository;

import com.student.stu.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
    Student findByName(String name);
}
