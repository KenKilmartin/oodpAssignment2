package oodpAssignment2;

import javax.swing.ImageIcon;

public class SpiderMan {

	private String name, author, desc;
	private ImageIcon image;

	public SpiderMan() {
		name = "Spider-Man";
		author = "Stan Lee";
		desc = "The character was created by writer-editor Stan Lee and writer-artist Steve Ditko, and first appeared in the anthology comic book Amazing Fantasy #15 (August 1962) in the Silver Age of Comic Books";
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


