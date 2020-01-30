package com.enigma.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enigma.test.model.Position;

public interface PositionRepository extends JpaRepository<Position, Integer> {
	
}