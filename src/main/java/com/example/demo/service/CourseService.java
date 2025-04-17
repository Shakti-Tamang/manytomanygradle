package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Course;

public interface CourseService {
    public void saveCourse(Course course);

    public List<Course> getAllCourses();

}
