package com.bsonin.model;

public class CommandLinePresenter implements Presenter {
	public void presentAsciiArt(AsciiArt asciiArt) {
		for (int y = 0; y < asciiArt.getHeight(); ++y) {
			for (int x = 0; x < asciiArt.getWidth(); ++x) {
				System.out.print(asciiArt.getCharacter(x, y));
			}
			System.out.println();
		}
	}
}
