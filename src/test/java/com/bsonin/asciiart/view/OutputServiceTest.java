package com.bsonin.asciiart.view;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OutputServiceTest
{
  @Test
  public void getPresenterWithCommandLineMediumReturnsCommandLinePresenter()
  {
    assertTrue(OutputService.getPresenter("CLI") instanceof CommandLinePresenter);
    assertTrue(OutputService.getPresenter("cli") instanceof CommandLinePresenter);
  }

  @Test(expected = IllegalArgumentException.class)
  public void getPresenterWithNullMediumThrowsException()
  {
    // FIXME:bhs - Should never be passed null...
    OutputService.getPresenter(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void getPresenterWithInvalidMediumThrowsException()
  {
    OutputService.getPresenter("optionDoesNotExist");
  }
}
