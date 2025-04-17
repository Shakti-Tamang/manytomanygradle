package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ClassRoom;
import com.example.demo.service.ClassRoomService;

@RestController
@Validated
public class ClassController {
private final ClassRoomService classRoomService;

public ClassController(ClassRoomService classRoomService){
    this.classRoomService=classRoomService;
}


@PostMapping("/assignClassRoom")
public ResponseEntity<String> assignStudentClass(@RequestBody ClassRoom classRoom){

    classRoomService.SaveStudentClassRoom(classRoom);

    return ResponseEntity.ok("Successfully assigned classromm");
}
}
