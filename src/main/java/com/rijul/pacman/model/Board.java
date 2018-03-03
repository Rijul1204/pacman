package com.rijul.pacman.model;

import java.util.Arrays;
import java.util.List;

public class Board {

	private Point[][] grid;
	private PointState[][] states;

	public Board(Point[][] grid, PointState[][] states) {
		super();
		this.grid = grid;
		this.states = states;
	}

	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Point[][] getGrid() {
		return grid;
	}

	public void setGrid(Point[][] grid) {
		this.grid = grid;
	}

	public PointState[][] getStates() {
		return states;
	}

	public void setStates(PointState[][] states) {
		this.states = states;
	}

	@Override
	public String toString() {
		return "Board [grid=" + Arrays.toString(grid) + ", states=" + Arrays.toString(states) + "]";
	}

}
