package com.rijul.pacman.service;

import com.rijul.pacman.model.Enemy;
import com.rijul.pacman.model.GameData;
import com.rijul.pacman.model.Move;

public interface EnemyMoveStrategy {
	
	Move getMove(GameData data, Enemy enemy);
}
