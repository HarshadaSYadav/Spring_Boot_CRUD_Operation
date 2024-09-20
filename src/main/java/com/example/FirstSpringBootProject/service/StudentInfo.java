package com.example.FirstSpringBootProject.service;

import com.example.FirstSpringBootProject.entity.Student;
import com.example.FirstSpringBootProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.MediaSize;
import java.util.List;

@Service
public class StudentInfo {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student){
      return repository.save(student);
    }
    public List<Student> saveStudents(List<Student> students){
        return repository.saveAll(students);
    }
    public List<Student> getStudents(){
        return repository.findAll();
    }
    public Student getStudentById(int id){
        return repository.findById(id).orElse(null);
    }
    public Student getStudentByName(String name){
        return repository.findByName(name);
    }
    public String deleteStudent(int id){
        repository.deleteById(id);
        return "Student Removed !!" +id;
    }
    public Student updateStudent(Student student){
        Student existingStudent=repository.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setRollno(student.getRollno());
        return repository.save(existingStudent);
    }

}
