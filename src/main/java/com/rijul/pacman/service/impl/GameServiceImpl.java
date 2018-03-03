package com.rijul.pacman.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rijul.pacman.model.*;
import com.rijul.pacman.service.*;

@Component
public class GameServiceImpl implements GameService {

	@Autowired
	private MovementApplyService movementService;
	@Autowired
	private BoardService boardService;
	@Autowired
	private ScorerService scorerService;
	@Autowired
	private GameDisplayService displayService;
	@Autowired
	private GameFactory gameFactory;

	// Model . . .
	private GameData gameData;

	private void init() {

		this.gameData = gameFactory.createGameData();
	}

	@Override
	public void start() {

		init();
		try {
			run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void run() throws InterruptedException {

		while (this.gameData.getState() != GameState.FINISHED) {

			refresh();
			Thread.sleep(500);
		}

	}

	private void refresh() {

		displayService.displayGame(gameData);

		Player player = this.gameData.getPlayer();
		Move playerMove = player.getStrategy().getMove(gameData, player);

		List<Move> enemyMoves = this.gameData.getEnemies().stream()
				.map(enemy -> enemy.getStrategy().getMove(this.gameData, enemy))
				.collect(Collectors.toList());
		
		

	}

}
