package com.bsonin.model;

public interface ImageUtils {

	Image openImage(String pathToImage);

	Image resize(int width, int height, Image image);

	AsciiArt createAsciiArt(Image image);

}
