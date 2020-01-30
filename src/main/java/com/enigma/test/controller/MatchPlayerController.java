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

import com.enigma.test.model.MatchPlayer;
import com.enigma.test.service.MatchPlayerService;

@RestController
public class MatchPlayerController {
	@Autowired
	MatchPlayerService matchPlayerService;
	
	@GetMapping("matchplayers")
	public ResponseEntity<List<MatchPlayer>> getListMatchPlayer(){
		List<MatchPlayer> listMatchPlayer = matchPlayerService.getAllMatchPlayer();
		return new ResponseEntity<>(listMatchPlayer, HttpStatus.OK);
	}
	
	@PostMapping("matchplayers/add")
	public ResponseEntity<MatchPlayer> addMatchPlayer(@RequestBody MatchPlayer matchPlayer){
		MatchPlayer result = matchPlayerService.addMatchPlayer(matchPlayer);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@PostMapping("matchplayers/update")
	public ResponseEntity<MatchPlayer> updateMatchPlayer(@RequestBody MatchPlayer matchPlayer){
		MatchPlayer result = matchPlayerService.updateMatchPlayer(matchPlayer);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
