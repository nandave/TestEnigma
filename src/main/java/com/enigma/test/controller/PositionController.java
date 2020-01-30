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

import com.enigma.test.model.Position;
import com.enigma.test.service.PositionService;

@RestController
public class PositionController {
	@Autowired
	PositionService positionService;
	
	@GetMapping("positions")
	public ResponseEntity<List<Position>> getListPosition(){
		List<Position> listPosition = positionService.getAllPosition();
		return new ResponseEntity<>(listPosition, HttpStatus.OK);
	}
	
	@PostMapping("positions/add")
	public ResponseEntity<Position> addPosition(@RequestBody Position position){
		Position result = positionService.addPosition(position);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@PostMapping("positions/update")
	public ResponseEntity<Position> updatePosition(@RequestBody Position position){
		Position result = positionService.updatePosition(position);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}