package com.example.teacher_student.repo;

import com.example.teacher_student.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataRepository extends JpaRepository<Data,Long> {
    List<Data> findByUserId(Long userId);
}
