package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ClassRoom;
import com.example.demo.service.ClassRoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

@GetMapping("/getAllClassRoom")
public ResponseEntity<List<ClassRoom>> getMethodName() {
    List<ClassRoom>lits=classRoomService.getAllClassRoom();

    return ResponseEntity.ok(lits);
}

}
