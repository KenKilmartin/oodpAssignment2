package oodpAssignment2;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class AmericanIdiotCD implements Cd{

	private String name;
	private ArrayList<String> tracks;
	private ImageIcon image;
	
	public AmericanIdiotCD() {
		name = "American Idiot";
		tracks = new ArrayList<>();
		tracks.add("American Idiot");
		tracks.add("Jesus of Suburbia");
		tracks.add("Holiday");
		tracks.add("Boulevard of Broken Dreams");
		tracks.add("Are We the Waiting");
		tracks.add("St. Jimmy");
		tracks.add("Give Me Novacaine");
		tracks.add("She's a Rebel");
		tracks.add("Extraordinary Girl");
		tracks.add("Letterbomb");
		tracks.add("Wake Me Up When September Ends");
		tracks.add("Homecoming");
		tracks.add("Whatsername");
		image = new ImageIcon("images/american_idiot.jpg");

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
