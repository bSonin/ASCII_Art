package com.bsonin.asciiart.model;

public interface Image
{
  int getWidth();

  int getHeight();

  Pixel getPixel(int x, int y);
}
