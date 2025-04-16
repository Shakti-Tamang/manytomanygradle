package com.example.demo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.http.ResponseEntity;

import com.example.demo.model.Student;
import com.example.demo.service.SaveStudent;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Validated
public class NewStudent {

    private final SaveStudent save;

    public NewStudent(SaveStudent save){
        this.save = save;
    }

    @PostMapping(value = "/saveStudent")
    public ResponseEntity<String> saveAllUsers(@RequestBody Student student){

        save.saveStudent(student);

        return ResponseEntity.ok("successfully saved user");
    }

    
}
