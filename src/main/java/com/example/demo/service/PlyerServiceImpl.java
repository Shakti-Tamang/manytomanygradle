package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Service;

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

    @Override
    public void savePlayer(Players players) {

        try{
     

    
    // String a="";
// System.out.println(a.compareTo("skjdksd"));


playerRepo.save(players); 

        }

        catch(Exception ex){

            throw new RuntimeException("error"+ex.getMessage());

        }

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




