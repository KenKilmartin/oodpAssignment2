package oodpAssignment2;

import javax.swing.ImageIcon;

public class GarfieldAdapter implements ComicBook {
	
	private Garfield garfield;

	public GarfieldAdapter(){
		garfield = new Garfield();
	}
	
	@Override
	public String getComic() {
		return garfield.getComicName();
	}

	@Override
	public ImageIcon getComicImage() {
		return garfield.getTheComicImage();
	}

	@Override
	public String getComicAuthor() {
		return garfield.getTheComicAuthor();
	}

	@Override
	public String getComicDesc() {
		return garfield.getTheComicDesc();
	}
}