package oodpAssignment2;

import javax.swing.ImageIcon;

public class SpiderManAdapter implements ComicBook {
	
	private SpiderMan spiderMan;

	public SpiderManAdapter(){
		spiderMan = new SpiderMan();
	}
	
	@Override
	public String getComic() {
		return spiderMan.getComicName();
	}

	@Override
	public ImageIcon getComicImage() {
		return spiderMan.getTheComicImage();
	}

	@Override
	public String getComicAuthor() {
		return spiderMan.getTheComicAuthor();
	}

	@Override
	public String getComicDesc() {
		return spiderMan.getTheComicDesc();
	}
}
