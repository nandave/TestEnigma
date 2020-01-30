package com.enigma.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enigma.test.model.Player;
import com.enigma.test.service.PlayerService;

@RestController
public class PlayerController {
	@Autowired
	PlayerService playerService;
	
	@GetMapping("players")
	public ResponseEntity<List<Player>> getListPlayer(){
		List<Player> listPlayer = playerService.getAllPlayer();
		return new ResponseEntity<>(listPlayer, HttpStatus.OK);
	}
	
	@PostMapping("players/add")
	public ResponseEntity<Player> addPlayer(@RequestBody Player player){
		Player result = playerService.addPlayer(player);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@PostMapping("players/update")
	public ResponseEntity<Player> updatePlayer(@RequestBody Player player){
		Player result = playerService.updatePlayer(player);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}