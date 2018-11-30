package com.bsonin.asciiart.model;

public class Pixel
{
  private int redValue;
  private int greenValue;
  private int blueValue;

  public Pixel(int[] rgbArray)
  {
    redValue = rgbArray[0];
    greenValue = rgbArray[1];
    blueValue = rgbArray[2];
  }

  public int getRedValue()
  {
    return redValue;
  }

  public void setRedValue(int redValue)
  {
    this.redValue = redValue;
  }

  public int getGreenValue()
  {
    return greenValue;
  }

  public void setGreenValue(int greenValue)
  {
    this.greenValue = greenValue;
  }

  public int getBlueValue()
  {
    return blueValue;
  }

  public void setBlueValue(int blueValue)
  {
    this.blueValue = blueValue;
  }

}
