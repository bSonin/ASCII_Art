package com.bsonin.asciiart.view;

import com.bsonin.asciiart.model.AsciiArt;

public class OutputService
{
  public static void outputImage(String medium, AsciiArt asciiArt)
  {
    Presenter presenter = getPresenter(medium);
    presenter.presentAsciiArt(asciiArt);
  }

  protected static Presenter getPresenter(String medium)
  {
    // TODO:bhs - Make valid mediums into enumeration
    // TODO:bhs - what if medium null - Never should be...
    switch (medium.toLowerCase()) {
      case "cli":
        return (Presenter) new CommandLinePresenter();
      default:
        // TODO:bhs - reasonable practice?
        throw new IllegalArgumentException("Invalid medium");
    }

  }
}
