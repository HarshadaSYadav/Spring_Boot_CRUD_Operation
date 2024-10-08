package com.example.FirstSpringBootProject.repository;

import com.example.FirstSpringBootProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Integer> {


    Student findByName(String name);
}
