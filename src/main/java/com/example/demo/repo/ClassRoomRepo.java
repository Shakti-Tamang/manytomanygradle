package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ClassRoom;

@Repository
public interface ClassRoomRepo extends JpaRepository<ClassRoom, Long> {

    @Query("SELECT c FROM ClassRoom c"+"JOIN FETCH c.students")

    public List<ClassRoom> findAllClasssRoomStudent();

}
