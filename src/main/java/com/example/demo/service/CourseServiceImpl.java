package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.repo.CourseRepo;

@Service
public class CourseServiceImpl  implements CourseService{

    private final CourseRepo courseRepo;

    public CourseServiceImpl(CourseRepo courseRepo){
        this.courseRepo=courseRepo;

    }

    @Override
    public void saveCourse(Course course) {
      
    }

}
