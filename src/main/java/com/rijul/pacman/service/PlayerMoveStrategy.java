package com.rijul.pacman.service;

import com.rijul.pacman.model.GameData;
import com.rijul.pacman.model.Move;
import com.rijul.pacman.model.Player;

public interface PlayerMoveStrategy {
	
	Move getMove(GameData data, Player player);
}
