package oodpAssignment2;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Californication implements Cd {

	private String name;
	private String bandName;
	private ArrayList<String> tracks;
	private ImageIcon image;
	
	public Californication(){
		name = "Californication";
		bandName = "Red Hot Chili Peppers";
		tracks = new ArrayList<>();
		tracks.add("Around The World");
		tracks.add("Parallel Universe");
		tracks.add("Scar Tissue");
		tracks.add("Otherside");
		tracks.add("Get On Top");
		tracks.add("Californication");
		tracks.add("Easily");
		tracks.add("Porcelain");
		tracks.add("Emit Remmus");
		tracks.add("I Like Dirt");
		tracks.add("This Velvet Glove");
		tracks.add("Savior");
		tracks.add("Purple Stain");
		tracks.add("Right On Time");
		tracks.add("Road Trippin'");
		tracks.add("Fat Dance");
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
	@Override
	public String getBandName() {
		return bandName;
	}

}
