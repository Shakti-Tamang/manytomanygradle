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

//     Loops through incoming studentList (only contains studentId).

// Fetches each student from DB using studentId.

// Adds the new course to each student's courseList (maintains bidirectional link).

// Finally, sets the full student list to the course and saves it.


// {
//   "courseTile": "Java Programming",
//   "courseCode": "JAVA101",
//   "courseDescription": "Introduction to Java fundamentals.",
//   "studentList": [
//     {
//       "studentId": 1
//     },
//     {
//       "studentId": 2
//     }
//   ]
// }



    @Override
    public void saveCourse(Course course) {

  List<Student> attachedStudents = new ArrayList<>();
        if(course.getStudentList()!=null){
      for(Student li:course.getStudentList()){

          li.getCourseList().add(course);

          attachedStudents.add(li); 
      }
    }
    course.setStudentList(attachedStudents);
      courseRepo.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
    List<Course>lists=courseRepo.findAllCourseWithStudent();
    return lists.isEmpty()? new ArrayList<>():lists;
    }

}
