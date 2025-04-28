package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Service;

import com.example.demo.GraphqlDto.playerInput;
import com.example.demo.model.Players;
import com.example.demo.repo.PlayerRepo;



@Service
public class PlyerServiceImpl implements PlyerService {

    private final PlayerRepo playerRepo;

    public  PlyerServiceImpl(PlayerRepo playerRepo){
        this.playerRepo=playerRepo;

    }

    public Long getId(){

        Random random=new Random();

    
        return random.nextLong(25333,26332);
    }


    @MutationMapping("createPlayer")
    @Override
    public void savePlayer(@Argument playerInput players) {
        try{
         
            Players player=convertToEntity(players);
    // String a="";
// System.out.println(a.compareTo("skjdksd"));
playerRepo.save(player); 
        }
        catch(Exception ex){

            throw new RuntimeException("error"+ex.getMessage());
        }
    }
    private Players convertToEntity(playerInput input) {
        Players player = new Players();
        player.setName(input.getName());
        player.setTeam(input.getTeam());
        player.setAge(input.getAge());
        player.setAddress(input.getAddress());
        player.setHeight(input.getHeight());
        player.setEmail(input.getEmail());
        return player;
    }

    @QueryMapping("getPlayers")
    @Override
    public List<Players> getAllPlayers() {
      
        List<Players>list=playerRepo.findAll();

        return list.isEmpty()? new ArrayList<>():list;
    }

    @QueryMapping("getPlayers")
    @Override
    public Players getPlayerById(@Argument Long id) {
        Players player=playerRepo.findById(id).orElse(null);
        return player; 
    }
    }




