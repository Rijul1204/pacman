package com.rijul.pacman.service;

import org.springframework.stereotype.Service;

import com.rijul.pacman.model.Player;

@Service
public interface InitializationService {
	
	public Player initializePlayer();

}
