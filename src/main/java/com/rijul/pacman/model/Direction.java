package com.rijul.pacman.model;

public enum Direction {

	LEFT(0, -1), RIGHT(0, 1), UP(-1, 0), DOWN(0, 1);

	private final int xMove;
	private final int yMove;

	private Direction(int xMove, int yMove) {
		this.xMove = xMove;
		this.yMove = yMove;
	}

	public int getxMove() {
		return xMove;
	}

	public int getyMove() {
		return yMove;
	}

}
