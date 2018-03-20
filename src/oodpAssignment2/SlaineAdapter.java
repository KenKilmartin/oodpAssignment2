package oodpAssignment2;

import javax.swing.ImageIcon;

public class SlaineAdapter implements ComicBook {


	private Slaine slaine;

	public SlaineAdapter(){
		slaine = new Slaine();
	}

	@Override
	public String getComic() {
		return slaine.getComicName();
	}

	@Override
	public ImageIcon getComicImage() {
		return slaine.getTheComicImage();
	}

	@Override
	public String getComicAuthor() {
		return slaine.getTheComicAuthor();
	}

	@Override
	public String getComicDesc() {
		return slaine.getTheComicDesc();
	}
}




