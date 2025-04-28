package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Players;

public interface PlayerRepo extends JpaRepository<Players,Long> {

}
