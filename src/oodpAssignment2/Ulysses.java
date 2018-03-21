package oodpAssignment2;

import javax.swing.ImageIcon;

public class Ulysses implements Book{


	private String name, author, desc;
	private ImageIcon image;

	public Ulysses() {
		name = "Ulysses";
		author = "James Joyce";
		desc = "Ulysses is a modernist novel by Irish writer James Joyce. It was first serialised in parts in the American journal The Little Review from March 1918 to December 1920 and then published in its entirety in Paris by Sylvia Beach on 2 February 1922, Joyce's 40th birthday. It is considered to be one of the most important works of modernist literature and has been called \"a demonstration and summation of the entire movement\". According to Declan Kiberd, \"Before Joyce, no writer of fiction had so foregrounded the process of thinking\". ";
		image = new ImageIcon("images/joyce.jpg");
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


