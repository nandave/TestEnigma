package com.enigma.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "match_player")
public class MatchPlayer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMatch;
	private Integer player;
	private Integer position;
	
	public Integer getIdMatch() {
		return idMatch;
	}
	public void setIdMatch(Integer idMatch) {
		this.idMatch = idMatch;
	}
	public Integer getPlayer() {
		return player;
	}
	public void setPlayer(Integer player) {
		this.player = player;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	
}
