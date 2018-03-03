package com.rijul.pacman.service;

import org.springframework.stereotype.Service;

import com.rijul.pacman.model.Board;
import com.rijul.pacman.model.GameData;

@Service
public interface GameDisplayService {

	void displayGame(GameData game);
}
