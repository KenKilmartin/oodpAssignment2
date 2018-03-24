package oodpAssignment2;

import javax.swing.ImageIcon;

public class HungerGames implements Book {

	private String name, author, desc;
	private ImageIcon image;
	
	public HungerGames() {
		name = "Hunger Games";
		author = "Suzanne Collins";
		desc = "The Hunger Games trilogy takes place in an unspecified future time, in the dystopian, post-apocalyptic nation of Panem, located in North America. The country consists of a wealthy Capitol city, located in the Rocky Mountains, surrounded by twelve (originally thirteen) poorer districts ruled by the Capitol. The Capitol is lavishly rich and technologically advanced, but the districts are in varying states of poverty. The trilogy's narrator and protagonist Katniss Everdeen, lives in District 12, the poorest region of Panem, located in Appalachia, where people regularly die of starvation. As punishment for a past rebellion against the Capitol (called the \"Dark Days\"), in which District 13 was supposedly destroyed, one boy and one girl from each of the twelve remaining districts, between the ages of 12 and 18, are selected by lottery to compete in an annual pageant called the Hunger Games. ";
		image = new ImageIcon("images/hunger_games.jpg");
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
