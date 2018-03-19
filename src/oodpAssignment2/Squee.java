package oodpAssignment2;

import javax.swing.ImageIcon;

public class Squee {
	
	private String name, author, desc;
	private ImageIcon image;
	
	public Squee() {
		name = "Squee";
		author = "Jhonen Vasquez";
		desc = "An introverted and bullied little kid with a less than supportive family, Squee has been forced to mature a bit more quickly than his peers. He is fond of writing, but only receives criticism from his teacher and taunting from his classmates.";
		image = new ImageIcon("images/squee.jpg");
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
