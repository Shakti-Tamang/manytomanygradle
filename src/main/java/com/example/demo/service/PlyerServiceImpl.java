package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Service;

import com.example.demo.GraphqlDto.PlayerInput;
import com.example.demo.model.Players;
import com.example.demo.repo.PlayerRepo;


@Service
public class PlyerServiceImpl implements PlyerService {
    private final PlayerRepo playerRepo;

    public PlyerServiceImpl(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }

    @Override
    public Players savePlayer(PlayerInput input) {
        Players player = new Players();
        player.setName(input.getName());
        player.setTeam(input.getTeam());
        player.setAge(input.getAge());
        player.setAddress(input.getAddress());
        player.setHeight(input.getHeight());
        player.setEmail(input.getEmail());
        return playerRepo.save(player);
    }

    @Override
    public List<Players> getAllPlayers() {
        return playerRepo.findAll();
    }

    @Override
    public Players getPlayerById(Long id) {
        return playerRepo.findById(id).orElseThrow(() -> 
            new RuntimeException("Player not found with id: " + id));
    }
}