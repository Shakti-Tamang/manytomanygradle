package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {


    @Query("SELECT c FROM Course c "+ "JOIN FETCH c.studentList s")
    public List<Course> findAllCourseWithStudent();

}
