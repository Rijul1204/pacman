package com.rijul.pacman.model;

import java.util.List;

public class Board {
	
	private Point[][] grid;
	private Player player;
	private List<Enemy> enemies;
	
	public Board(Point[][] grid, Player player, List<Enemy> enemies) {
		super();
		this.grid = grid;
		this.player = player;
		this.enemies = enemies;
	}
}
