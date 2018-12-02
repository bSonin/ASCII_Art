package com.bsonin.asciiart.service;

import com.bsonin.asciiart.model.AsciiArt;
import com.bsonin.asciiart.model.Image;
import com.bsonin.asciiart.view.OutputService;

public class AsciiArtGenerator
{
  private ImageService imageUtils;

  public AsciiArtGenerator()
  {
    imageUtils = new ImageServiceImplImageJ();
  }

  public void process()
  {
    // TODO:bhs - Exception handling here
    Image image = openImage();
    image = resizeImage(image);
    AsciiArt asciiArt = imageUtils.createAsciiArt(image);
    OutputService.outputImage("CLI", asciiArt);
  }

  public Image openImage()
  {
    // FIXME:bhs - Image/path should come from command line
    return imageUtils.openImage("/Users/benjaminsonin/Desktop/test_pic.jpg");
  }

  public Image resizeImage(Image image)
  {
    return imageUtils.resize(320, 240, image);
  }

}
