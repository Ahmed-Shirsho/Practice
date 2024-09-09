package com.example.ucam.controller;

import com.example.ucam.model.Student;
import com.example.ucam.model.Teacher;
import com.example.ucam.repo.StudentRepository;
import com.example.ucam.repo.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("/students")
    public List<Teacher> getAllStudents() {
        return teacherRepository.findAll();
    }
}

