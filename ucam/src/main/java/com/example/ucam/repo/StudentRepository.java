package com.example.ucam.repo;

import com.example.ucam.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findByUsername(String username);
}
