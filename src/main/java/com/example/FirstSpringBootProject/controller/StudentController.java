package com.example.FirstSpringBootProject.controller;

import com.example.FirstSpringBootProject.entity.Student;
import com.example.FirstSpringBootProject.service.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentInfo info;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return info.saveStudent(student);
    }
    @PostMapping("/addStudents")
    public java.util.List<Student> addStudents(@RequestBody List<Student> students){
        return info.saveStudents(students);
    }

    @GetMapping("/students")
    public java.util.List<Student> findAllStudents(){
        return info.getStudents();
    }
    @GetMapping("/studentById/{id}")
    public Student findStudentById(@PathVariable int id){
        return info.getStudentById(id);
    }
    @GetMapping("/student/{name}")
    public Student findStudentByName(@PathVariable String name){
        return info.getStudentByName(name);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return info.updateStudent(student);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return info.deleteStudent(id);
    }
}
