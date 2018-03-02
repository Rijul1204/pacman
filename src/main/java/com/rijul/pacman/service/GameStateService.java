package com.rijul.pacman.service;

import com.rijul.pacman.model.Board;
import com.rijul.pacman.model.GameState;

public interface GameStateService {

	public GameState getGameState(Board board);

}
