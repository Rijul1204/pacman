package com.rijul.pacman.service;

import org.springframework.stereotype.Service;

import com.rijul.pacman.model.GameData;

@Service
public interface GameFactory {

	GameData createGameData();
}
