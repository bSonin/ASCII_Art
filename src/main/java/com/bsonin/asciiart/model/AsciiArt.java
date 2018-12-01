package com.bsonin.asciiart.model;

import com.bsonin.asciiart.utils.MathUtils;

public class AsciiArt
{
  private char[][] characterGrid;

  public AsciiArt(int x, int y)
  {
    if (MathUtils.isPositive(x) && MathUtils.isPositive(y))
    {
      characterGrid = new char[x][y];
    } else
    {
      // TODO:bhs - Better message
      throw new AsciiArtIndexException(
          "Cannot create ASCII Art negative or zero size.");
    }
  }

  public char getCharacter(int x, int y)
  {
    if (!MathUtils.isNegative(x) && !MathUtils.isNegative(y))
    {
      return characterGrid[x][y];
    }
    throw new AsciiArtIndexException("Invalid AsciiArt grid location");
  }

  public void setCharacter(int x, int y, char character)
  {
    if (!MathUtils.isNegative(x) && !MathUtils.isNegative(y))
    {
      characterGrid[x][y] = character;
      return;
    }
    throw new AsciiArtIndexException("Invalid AsciiArt grid location");
  }

  public int getWidth()
  {
    return characterGrid.length;
  }

  public int getHeight()
  {
    return characterGrid[0].length;
  }
}
