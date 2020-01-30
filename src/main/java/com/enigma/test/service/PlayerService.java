package com.enigma.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigma.test.model.Player;
import com.enigma.test.repository.PlayerRepository;

@Service
public class PlayerService {
	@Autowired
	PlayerRepository playerRepository;
	
	public List<Player> getAllPlayer(){
		return playerRepository.findAll();
	}
	
	public Player addPlayer(Player player) {
		return playerRepository.save(player);
	}
	
	public Player updatePlayer(Player player) {
		return playerRepository.save(player);
	}
}
