package com.bsonin.asciiart.service;

import com.bsonin.asciiart.model.AsciiArt;
import com.bsonin.asciiart.model.Image;

public interface ImageService
{
  Image openImage(String pathToImage);

  Image resize(int width, int height, Image image);

  AsciiArt createAsciiArt(Image image);
}
