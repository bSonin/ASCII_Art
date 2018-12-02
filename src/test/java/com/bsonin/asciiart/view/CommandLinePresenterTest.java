package com.bsonin.asciiart.view;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.bsonin.asciiart.model.AsciiArt;

public class CommandLinePresenterTest
{
  @Test
  public void presentAsciiArtPrintsArtToSystemOut()
  {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    AsciiArt asciiArt = new AsciiArt(2, 2);
    asciiArt.setCharacter(0, 0, 'a');
    asciiArt.setCharacter(1, 0, 'b');
    asciiArt.setCharacter(0, 1, 'c');
    asciiArt.setCharacter(1, 1, 'd');

    String lineSeparator = System.getProperty("line.separator");
    String expectedOutput = "ab" + lineSeparator + "cd" + lineSeparator;

    Presenter commandLinePresenter = new CommandLinePresenter();
    commandLinePresenter.presentAsciiArt(asciiArt);

    assertEquals(expectedOutput, baos.toString());
  }

}
