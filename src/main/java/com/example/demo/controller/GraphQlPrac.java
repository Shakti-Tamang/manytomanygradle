package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PlayerService;

@RestController

@RequestMapping("api/v1")
public class GraphQlPrac {

private final PlayerService playerService;

public GraphQlPrac(PlayerService playerService){

    this.playerService=playerService;
}



}
