package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Players;

public interface PlyerService {

    public void savePlayer(Players players);

    public List<Players>getAllPlayers();

    public Players  getPlayerById(int playerId);

}
