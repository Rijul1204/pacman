package com.rijul.pacman.model;

import com.rijul.pacman.service.EnemyMoveStrategy;

public class Enemy {

	private Position position;
	private EnemyMoveStrategy strategy;

	public Enemy(Position position) {
		super();
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public EnemyMoveStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(EnemyMoveStrategy strategy) {
		this.strategy = strategy;
	}
	
	
}
