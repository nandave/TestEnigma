package com.enigma.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigma.test.model.Position;
import com.enigma.test.repository.PositionRepository;

@Service
public class PositionService {
	@Autowired
	PositionRepository positionRepository;
	
	public List<Position> getAllPosition(){
		return positionRepository.findAll();
	}
	
	public Position addPosition(Position position) {
		return positionRepository.save(position);
	}
	
	public Position updatePosition(Position position) {
		return positionRepository.save(position);
	}
}
