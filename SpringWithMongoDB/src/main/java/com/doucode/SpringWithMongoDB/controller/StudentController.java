package com.doucode.SpringWithMongoDB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doucode.SpringWithMongoDB.model.Student;
import com.doucode.SpringWithMongoDB.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    private StudentRepository repo;

    @PostMapping("/add")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
      Student save = this.repo.save(student);
      return ResponseEntity.ok(save);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getStudents(){
     
      return ResponseEntity.ok(this.repo.findAll());
    }
}