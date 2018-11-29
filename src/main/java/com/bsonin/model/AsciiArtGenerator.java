package com.bsonin.model;

public class AsciiArtGenerator
{
  private ImageUtils imageUtils;

  public AsciiArtGenerator()
  {
    imageUtils = new ImageUtilsImplImageJ();
  }

  public void process()
  {
    Image image = openImage();
    image = resizeImage(image);
    AsciiArt asciiArt = imageUtils.createAsciiArt(image);
    OutputUtils.outputImage("CLI", asciiArt);
  }

  public Image openImage()
  {
    return imageUtils.openImage("/Users/benjaminsonin/Desktop/test_pic.jpg");
  }

  public Image resizeImage(Image image)
  {
    return imageUtils.resize(320, 240, image);
  }

}
