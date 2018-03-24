package oodpAssignment2;

import javax.swing.ImageIcon;

public class Garfield {

	private String name, author, desc;
	private ImageIcon image;

	public Garfield() {
		name = "Garfield";
		author = "Jim Davis";
		desc = "Common themes in the strip include Garfield's laziness, obsessive eating, coffee, and disdain of Mondays and diets. The strip's focus is mostly on the interactions among Garfield, Jon, and Odie, but other recurring minor characters appear as well.";
		image = new ImageIcon("images/garfield.jpg");
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
