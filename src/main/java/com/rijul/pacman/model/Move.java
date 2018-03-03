package com.rijul.pacman.model;

public class Move {

	private Position previousPosition;
	private Position CurrentPosition;

	public Move(Position previousPosition, Position currentPosition) {
		super();
		this.previousPosition = previousPosition;
		CurrentPosition = currentPosition;
	}

	public Position getPreviousPosition() {
		return previousPosition;
	}

	public void setPreviousPosition(Position previousPosition) {
		this.previousPosition = previousPosition;
	}

	public Position getCurrentPosition() {
		return CurrentPosition;
	}

	public void setCurrentPosition(Position currentPosition) {
		CurrentPosition = currentPosition;
	}

}
