package oodpAssignment2;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class NevermindCD implements Cd{



	private String name;
	private String bandName;
	private ArrayList<String> tracks;
	private ImageIcon image;

	public NevermindCD() {
		name = "Nevermind";
		bandName = "Nirvana";
		tracks = new ArrayList<>();
		tracks.add("Smells Like Teen Spirit");
		tracks.add("In Bloom");
		tracks.add("Come as You Are");
		tracks.add("Breed");
		tracks.add("Lithium");
		tracks.add("Polly");
		tracks.add("Territorial Pissings");
		tracks.add("Drain You");
		tracks.add("Lounge Act");
		tracks.add("Stay Away");
		tracks.add("On a Plain");
		tracks.add("Something in the Way");
		image = new ImageIcon("images/nevermind.jpg");

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

	@Override
	public String getBandName() {
		return bandName;
	}

}


