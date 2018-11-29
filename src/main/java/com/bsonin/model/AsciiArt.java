package com.bsonin.model;

public class AsciiArt {
	private char[][] characterGrid;

	public AsciiArt(int x, int y) {
		characterGrid = new char[x][y];
	}

	public char getCharacter(int x, int y) {
		return characterGrid[x][y];
	}

	public void setCharacter(int x, int y, char character) {
		characterGrid[x][y] = character;
	}

	public int getWidth() {
		return characterGrid.length;
	}

	public int getHeight() {
		return characterGrid[0].length;
	}
}
