package com.example.demo.controller;


import com.example.demo.GraphqlDto.playerInput;
import com.example.demo.model.Players;
import com.example.demo.service.PlyerService;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class GraphQlPrac {
    private final PlyerService plyerService;

    public GraphQlPrac(PlyerService plyerService) {
        this.plyerService = plyerService;
        log.info("GraphQL Controller initialized");
    }

    @MutationMapping
    public Players createPlayer(@Argument playerInput playerInput) {
        log.info("Creating player: {}", playerInput.getName());
        return plyerService.savePlayer(playerInput);
    }

    @QueryMapping
    public Players getPlayer(@Argument Long playerId) {
        return plyerService.getPlayerById(playerId);
    }

    @QueryMapping("allPlayers")
    public List<Players> getAll() {
        return plyerService.getAllPlayers();
    }
}