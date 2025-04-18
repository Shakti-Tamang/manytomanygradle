package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ClassRoom;

public interface ClassRoomService {
    public void SaveStudentClassRoom(ClassRoom classRoom);

    public List<ClassRoom>getAllClassRoom();

}
