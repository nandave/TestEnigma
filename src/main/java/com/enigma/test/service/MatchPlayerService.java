package com.enigma.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigma.test.model.MatchPlayer;
import com.enigma.test.repository.MatchPlayerRepository;

@Service
public class MatchPlayerService {
	@Autowired
	MatchPlayerRepository matchPlayerRepository;
	
	public List<MatchPlayer> getAllMatchPlayer(){
		return matchPlayerRepository.findAll();
	}
	
	public MatchPlayer addMatchPlayer(MatchPlayer matchPlayer) {
		return matchPlayerRepository.save(matchPlayer);
	}
	
	public MatchPlayer updateMatchPlayer(MatchPlayer matchPlayer) {
		return matchPlayerRepository.save(matchPlayer);
	}
}
