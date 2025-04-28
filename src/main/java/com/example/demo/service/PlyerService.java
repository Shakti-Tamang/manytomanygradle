package com.example.demo.service;

import java.util.List;

import com.example.demo.GraphqlDto.PlayerInput;
import com.example.demo.model.Players;



public interface PlyerService {

    public Players savePlayer(PlayerInput players);

    public List<Players>getAllPlayers();

    public Players  getPlayerById(Long playerId);

}
