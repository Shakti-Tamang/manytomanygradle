package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Players;
import com.example.demo.service.PlyerService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController

@RequestMapping("api/v1")
public class GraphQlPrac {

private final PlyerService plyerService;

public GraphQlPrac(PlyerService plyerService){

    this.plyerService=plyerService;
}

@PostMapping("/savePlyr")
public ResponseEntity<String> savePlayer(@RequestBody  Players players ) {


    plyerService.savePlayer(players);

    return ResponseEntity.ok("success");

}


@GetMapping("/getPlyr")
public ResponseEntity<Players> getPlayer(@PathVariable("id") Long id) {

    Players player=plyerService.getPlayerById(id);
    return ResponseEntity.ok(player);
    
}
@GetMapping("/getAllPlayer")
public ResponseEntity<List<Players>> getAll() {
    
    List<Players>list=plyerService.getAllPlayers();
    return ResponseEntity.ok(list);
}







}
