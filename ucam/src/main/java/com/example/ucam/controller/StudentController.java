package com.example.ucam.controller;

import com.example.ucam.model.Student;
import com.example.ucam.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/me")
    public ResponseEntity<Student> getMyDetails(Principal principal) {
        String username = principal.getName();
        Student student = studentRepository.findByUsername(username);
        return ResponseEntity.ok(student);
    }
}
