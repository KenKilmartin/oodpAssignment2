package oodpAssignment2;

import javax.swing.ImageIcon;

public class NineteenEightyFour implements Book{


	private String name, author, desc;
	private ImageIcon image;

	public NineteenEightyFour() {
		name = "1984";
		author = "George Orwell";
		desc = "1984 is a dystopian novel published in 1949 by English author George Orwell.The novel is set in Airstrip One, formerly Great Britain, a province of the superstate Oceania, whose residents are victims of perpetual war, omnipresent government surveillance and public manipulation. ";
		image = new ImageIcon("images/1984.jpg");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public ImageIcon getImage() {
		return image;
	}

	@Override
	public String getAuthor() {
		return author;
	}

	@Override
	public String getDesc() {
		return desc;
	}

}


