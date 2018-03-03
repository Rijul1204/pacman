package com.rijul.pacman.service;

import java.util.List;

import com.rijul.pacman.model.*;

public interface MovementApplyService {
	
	public void applyMove(GameData data, Move playerMove, List<Move> enemyMoves);
}
