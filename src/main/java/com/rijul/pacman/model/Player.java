package com.rijul.pacman.model;

import com.rijul.pacman.service.PlayerMoveStrategy;

public class Player {

	private String name;
	private int score;
	private Position position;
	private PlayerMoveStrategy strategy;

	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public PlayerMoveStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(PlayerMoveStrategy strategy) {
		this.strategy = strategy;
	}

}
