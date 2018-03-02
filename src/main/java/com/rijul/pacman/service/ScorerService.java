package com.rijul.pacman.service;

import com.rijul.pacman.model.Board;
import com.rijul.pacman.model.Player;

public interface ScorerService {

	public void updatePlayerScore(Player p, Board b);

}
