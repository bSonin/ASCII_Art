package com.bsonin.asciiart.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bsonin.asciiart.model.AsciiArt;
import com.bsonin.asciiart.model.AsciiArtIndexException;

public class AsciiArtTest
{

  @Test(expected = AsciiArtIndexException.class)
  public void constructingAsciiArtWithNegativeSizeThrowsException()
  {
    new AsciiArt(-1, -1);
  }

  @Test(expected = AsciiArtIndexException.class)
  public void constructingAsciiArtWithZeroSizeThrowsException()
  {
    new AsciiArt(0, 0);
  }

  @Test
  public void constructingAsciiArtWithPositiveSizeReturnsAsciiArt()
  {
    AsciiArt asciiArt = new AsciiArt(5, 5);

    // FIXME:bhs - How do I avoid the dependence on other methods being tested?
    assertEquals(5, asciiArt.getWidth());
    assertEquals(5, asciiArt.getHeight());

  }

  @Test
  public void getWidthReturnsWithOfAsciiArt()
  {
    AsciiArt asciiArt = new AsciiArt(5, 3);

    assertEquals(5, asciiArt.getWidth());
  }

  @Test
  public void getHeightReturnsHeightOfAsciiArt()
  {
    AsciiArt asciiArt = new AsciiArt(5, 3);

    assertEquals(3, asciiArt.getHeight());
  }
}
