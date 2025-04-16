package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.repo.CourseRepo;
import com.example.demo.repo.StudentRepo;

@Service
public class CourseServiceImpl  implements CourseService{

    private final CourseRepo courseRepo;

    private final StudentRepo repo;

    public CourseServiceImpl(CourseRepo courseRepo,StudentRepo repo){
        this.courseRepo=courseRepo;

        this.repo=repo;

    }

    @Override
    public void saveCourse(Course course) {
 

      for(Student li:course.getStudentList()){
          course.getStudentList().add(li);

          li.getCourseList().add(course);

         repo.save(li);
      }

      courseRepo.save(course);


    }

}
