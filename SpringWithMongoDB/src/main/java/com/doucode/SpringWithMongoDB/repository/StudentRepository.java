package com.doucode.SpringWithMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.doucode.SpringWithMongoDB.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {
    
}