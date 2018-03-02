package com.rijul.pacman.service;

import com.rijul.pacman.model.*;

public interface MovementService {

	public Direction getNextDirection(Player p);

	public Point getNextPosition(Player p);

	public Direction getNextDirection(Enemy enemy);

	public Point getNextPosition(Enemy p);
}
