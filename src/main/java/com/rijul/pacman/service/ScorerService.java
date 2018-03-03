package com.rijul.pacman.service;

import org.springframework.stereotype.Service;

import com.rijul.pacman.model.Board;
import com.rijul.pacman.model.Player;
import com.rijul.pacman.model.Point;

@Service
public interface ScorerService {

	public int getScore(Board b, Point position);

}
