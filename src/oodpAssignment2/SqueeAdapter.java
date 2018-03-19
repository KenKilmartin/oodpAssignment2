package oodpAssignment2;

import javax.swing.ImageIcon;

public class SqueeAdapter implements Book {
	
	private Squee squee;
	
	public SqueeAdapter(Squee squee) {
		this.squee =squee;
	}

	
	public String getName() {
		return this.squee.getComic();
	}

	
	public ImageIcon getImage() {
		// TODO Auto-generated method stub
		return this.squee.getComicImage();
	}

	
	public String getAuthor() {
		// TODO Auto-generated method stub
		return this.squee.getComicAuthor();
	}

	
	public String getDesc() {
		return this.squee.getComicDesc();
	}

//	@Override
//	public String getComic() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ImageIcon getComicImage() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getComicAuthor() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getComicDesc() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
