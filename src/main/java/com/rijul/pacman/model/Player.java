package com.rijul.pacman.model;

public class Player {

	private String name;
	private int score;
	private Direction direction;
	private Point position;

	public Player(String name, int score, Direction direction, Point position) {
		super();
		this.name = name;
		this.score = score;
		this.direction = direction;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

}
