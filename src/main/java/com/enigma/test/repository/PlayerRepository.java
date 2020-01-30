package com.enigma.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enigma.test.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
