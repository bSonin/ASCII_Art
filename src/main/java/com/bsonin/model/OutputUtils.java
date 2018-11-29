package com.bsonin.model;

public class OutputUtils {
	public static void outputImage(String medium, AsciiArt asciiArt) {
		Presenter presenter = getPresenter(medium);
		presenter.presentAsciiArt(asciiArt);
	}

	private static Presenter getPresenter(String medium) {
		return (Presenter) new CommandLinePresenter();
	}
}
