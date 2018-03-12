package oodpAssignment2;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Californication implements Cd {

	private String name;
	private ArrayList<String> tracks;
	private ImageIcon image;
	
	public Californication(){
		name = "Californication";
		tracks = new ArrayList<>();
		tracks.add("1");
		tracks.add("2");
		tracks.add("3");
		tracks.add("4");
		tracks.add("5");
		tracks.add("6");
		tracks.add("7");
		tracks.add("");
		tracks.add("");
		tracks.add("");
		tracks.add("");
		tracks.add("");
		tracks.add("");
		image = new ImageIcon("images/californication.jpg");

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
	public ArrayList<String> getTracks() {

		return tracks;
	}

}
