package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.model.ClassRoom;
import com.example.demo.model.Student;
import com.example.demo.repo.ClassRoomRepo;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {

    private final ClassRoomRepo classRoomRepo;

    

    public ClassRoomServiceImpl(ClassRoomRepo classRoomRepo){
        this.classRoomRepo=classRoomRepo;
    }

    @Override
    public void SaveStudentClassRoom(ClassRoom classRoom) {

        
        List<Student>assignedStudentList=new ArrayList<>();

        if(classRoom.getStudents()!=null){
        for(Student li:classRoom.getStudents()){

            assignedStudentList.add(li);

            li.getClassRoomList().add(classRoom);
        }

        classRoom.setStudents(assignedStudentList);

         
    }
    classRoomRepo.save(classRoom);
}

@Cacheable(value = "classroomCache", key = "'StudentKycCache'")
@Override
public List<ClassRoom> getAllClassRoom() {
    List<ClassRoom> list = classRoomRepo.findAllClasssRoomStudent();
    return list.isEmpty() ? new ArrayList<>() : list;
}

}
