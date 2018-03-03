package com.rijul.pacman.service.impl;

import org.springframework.stereotype.Component;

import com.rijul.pacman.model.Board;
import com.rijul.pacman.model.GameData;
import com.rijul.pacman.model.Point;
import com.rijul.pacman.service.GameDisplayService;

@Component
public class GameDisplayServiceImpl implements GameDisplayService {

	@Override
	public void displayGame(GameData game) {

		Board board = game.getBoard();
		Point[][] grid = board.getGrid();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (game.getPlayer().getPosition().equals(grid[i][j])) {
					System.out.print("P");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();
	}

}
