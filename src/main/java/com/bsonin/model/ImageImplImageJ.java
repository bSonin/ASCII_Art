package com.bsonin.model;

import ij.ImagePlus;

public class ImageImplImageJ implements Image {
	private ImagePlus image;

	public ImageImplImageJ(ImagePlus image) {
		this.image = image;
	}

	public int getWidth() {
		return image.getWidth();
	}

	public int getHeight() {
		return image.getHeight();
	}

	public Pixel getPixel(int x, int y) {
		int[] rgb = new int[3];
		image.getProcessor().getPixel(x, y, rgb);
		return new Pixel(rgb);
	}

	public ImagePlus getImage() {
		return image;
	}

	public void setImage(ImagePlus image) {
		this.image = image;
	}

}
