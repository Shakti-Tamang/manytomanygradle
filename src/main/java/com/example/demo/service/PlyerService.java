package com.example.demo.service;

import java.util.List;

import com.example.demo.GraphqlDto.playerInput;
import com.example.demo.model.Players;



public interface PlyerService {

    public Players savePlayer(playerInput players);

    public List<Players>getAllPlayers();

    public Players  getPlayerById(Long playerId);

}
