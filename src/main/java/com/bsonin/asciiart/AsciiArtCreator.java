package com.bsonin.asciiart;

import com.bsonin.asciiart.service.AsciiArtGenerator;

public class AsciiArtCreator
{
  public static void main(String[] args)
  {
    AsciiArtGenerator asciiArtGenerator = new AsciiArtGenerator();
    asciiArtGenerator.process();
  }
}
