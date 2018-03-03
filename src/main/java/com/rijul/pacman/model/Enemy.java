package com.rijul.pacman.model;

import com.rijul.pacman.service.EnemyMoveStrategy;

public class Enemy {

	private Position position;
	private EnemyMoveStrategy strategy;

	public Enemy(Position position) {
		super();
		this.position = position;
	}
}
