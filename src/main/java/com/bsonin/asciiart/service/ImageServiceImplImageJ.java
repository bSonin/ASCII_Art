package com.bsonin.asciiart.service;

import com.bsonin.asciiart.model.AsciiArt;
import com.bsonin.asciiart.model.Image;
import com.bsonin.asciiart.model.ImageImplImageJ;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

public class ImageServiceImplImageJ implements ImageService
{
  public Image openImage(String pathToImage)
  {
    // TODO:bhs - Exception handling needed here
    return new ImageImplImageJ(IJ.openImage(pathToImage));
  }

  public Image resize(int width, int height, Image image)
  {
    ImageImplImageJ imageImpl = (ImageImplImageJ) image;
    ImagePlus imp = imageImpl.getImage();
    ImageProcessor processor = imp.getProcessor().resize(width, height);

    ImagePlus impNew = new ImagePlus("dummyTitle", processor);
    return new ImageImplImageJ(impNew);
  }

  public AsciiArt createAsciiArt(Image image)
  {
    int stretchFactor = 3;
    AsciiArt asciiArt = new AsciiArt(image.getWidth() * stretchFactor,
        image.getHeight());

    ImageImplImageJ imageImpl = (ImageImplImageJ) image;
    ImagePlus imp = imageImpl.getImage();
    ImageProcessor processor = imp.getProcessor();

    for (int x = 0; x < image.getWidth(); ++x)
    {
      for (int y = 0; y < image.getHeight(); ++y)
      {
        for (int counter = 0; counter < stretchFactor; ++counter)
        {
          char asciiChar = getMappedASCII(getPixelBrightness(x, y, processor));
          int xIndex = getAsciiArtStretchedIndex(stretchFactor, counter, x);
          asciiArt.setCharacter(xIndex, y, asciiChar);
        }
      }
    }
    return asciiArt;
  }

  public static int getAsciiArtStretchedIndex(int stretchFactor, int loopCounter,
      int imagePositionX)
  {
    return ((stretchFactor - 1) * imagePositionX) + imagePositionX + loopCounter;
  }

  public static int getAverageRGB(int[] rgb)
  {
    return (rgb[0] + rgb[1] + rgb[2]) / 3;
  }

  public static int getLuminosity(int[] rgb)
  {
    return (int) (0.21 * rgb[0] + 0.72 * rgb[1] + 0.07 * rgb[2]);
  }

  public static char getMappedASCII(int brightness)
  {
    String charMap = "`^\",:;Il!i~+_-?][}{1)(|\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$";
    int numChars = charMap.length();
    int bucketSize = (int) Math.ceil(256.0 / numChars);
    return charMap.charAt(brightness / bucketSize);
  }

  public static int getPixelBrightness(int x, int y, ImageProcessor processor)
  {
    int[] rgb = new int[3];
    processor.getPixel(x, y, rgb);
    return getLuminosity(rgb);
  }

}
