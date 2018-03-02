package com.rijul.pacman.model;

public class Enemy {

	private Point position;
	private Direction direction;

	public Enemy(Point point, Direction direction) {
		super();
		this.position = point;
		this.direction = direction;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

}
