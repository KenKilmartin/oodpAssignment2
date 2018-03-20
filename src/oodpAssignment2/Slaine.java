package oodpAssignment2;

import javax.swing.ImageIcon;

public class Slaine {

	private String name, author, desc;
	private ImageIcon image;
	
	public Slaine() {
		name = "Slaine: Book of Invation";
		author = "Glenn fabry";
		desc = "Exiled from his tribe, Slaine is forced to roam the land of the Tir-Nan-Og with Ukko. Ahead of him lie terrifying ordeals that will require all of Slaine's famed warrior strength if he is to return victorious and claim his rightful place as King.";
		image = new ImageIcon("images/slaine.jpg");
	}

	public String getComicName() {
		return name;
	}

	public ImageIcon getTheComicImage() {
		return image;
	}

	public String getTheComicAuthor() {
		return author;
	}

	public String getTheComicDesc() {
		return desc;
	}

}