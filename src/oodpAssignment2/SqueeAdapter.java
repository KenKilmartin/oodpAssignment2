package oodpAssignment2;

import javax.swing.ImageIcon;

public class SqueeAdapter implements ComicBook {
	
	private Squee squee;

	public SqueeAdapter(){
		squee = new Squee();
	}
	
	@Override
	public String getComic() {
		return squee.getComicName();
	}

	@Override
	public ImageIcon getComicImage() {
		return squee.getTheComicImage();
	}

	@Override
	public String getComicAuthor() {
		return squee.getTheComicAuthor();
	}

	@Override
	public String getComicDesc() {
		return squee.getTheComicDesc();
	}
}
