package oodpAssignment2;


import java.util.ArrayList;

import javax.swing.ImageIcon;

public class MoonSafari implements Cd{


	private String name;
	private String bandName;
	private ArrayList<String> tracks;
	private ImageIcon image;

	public MoonSafari() {
		name = "Moon Safari";
		bandName = "Air";
		tracks = new ArrayList<>();
		tracks.add("La Femme d'argent");
		tracks.add("Sexy Boy");
		tracks.add("All I Need");
		tracks.add("Kelly Watch the Stars");
		tracks.add("Talisman");
		tracks.add("Remember");
		tracks.add("You Make It Easy");
		tracks.add("Ce matin la");
		tracks.add("New Star in the Sky");
		tracks.add("Le Voyage de Penelope");
		image = new ImageIcon("images/air.jpg");

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


