package com.enigma.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enigma.test.model.MatchPlayer;

public interface MatchPlayerRepository extends JpaRepository<MatchPlayer, Integer> {
	
}
