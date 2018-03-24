package oodpAssignment2;

import javax.swing.ImageIcon;

public class Metamorphosis implements Book{


	private String name, author, desc;
	private ImageIcon image;

	public Metamorphosis() {
		name = "The Metamorphosis";
		author = "Franz Kafka";
		desc = "The story is a parallel to Kafka’s own life. Gregor is Kafka, Gregor’s father is Kafka’s father, and the sister and mother too are the parallels of Kafka’s sister and mother. Kafka was always at odds with his father, who thought Kafka to be weak. Kafka’s sister always took his side, but later on, she too abandoned him (or at least that’s how Kafka felt at that time). ";
		image = new ImageIcon("images/Kafka.jpg");
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


