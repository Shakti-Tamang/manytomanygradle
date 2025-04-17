package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;

@RestController
@Validated
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService=courseService;

    }

    @PostMapping(value = "/saveCourse")
    public ResponseEntity<String> saveAllCourses(@RequestBody Course course){
        
    courseService.saveCourse(course);

    return ResponseEntity.ok("succeedully saved course");
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Course>> getAllCourses(){
        List<Course>list=courseService.getAllCourses();

        return ResponseEntity.ok(list);
    }
    
}
