package com.bsonin.asciiart.view;

import com.bsonin.asciiart.model.AsciiArt;

public class OutputService
{
  public static void outputImage(String medium, AsciiArt asciiArt)
  {
    Presenter presenter = getPresenter(medium);
    presenter.presentAsciiArt(asciiArt);
  }

  private static Presenter getPresenter(String medium)
  {
    return (Presenter) new CommandLinePresenter();
  }
}
