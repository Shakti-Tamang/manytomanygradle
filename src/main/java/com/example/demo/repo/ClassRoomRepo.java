package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ClassRoom;

@Repository
public interface ClassRoomRepo extends JpaRepository<ClassRoom, Long> {

}
