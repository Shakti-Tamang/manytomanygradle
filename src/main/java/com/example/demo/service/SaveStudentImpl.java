package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class SaveStudentImpl  implements SaveStudent{


    private final StudentRepo repo;

    public SaveStudentImpl(StudentRepo repo){
        this.repo=repo;
    }

    @Override
    public void saveStudent(Student student) {
       repo.save(student);
    }

}
