package oodpAssignment2;

import java.awt.*;

import javax.swing.*;

public class Library extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AbstractFactory bookFactory, cdFactory,comicFactory;
	
//	should be:
//	private AbstractFactory factory;
//	and then in program-if book clicked then: factory = FactoryProducer.getFactory("Book");
	
	public Library() {
		super("Library");
		bookFactory = FactoryProducer.getFactory("Book");
		cdFactory = FactoryProducer.getFactory("CD");
		comicFactory = FactoryProducer.getFactory("ComicBook");
		makeGUI();
	}
	private void makeGUI() {
		JPanel centerPanel = new JPanel();
		JLabel label1 = new JLabel("Author of harry potter: "+bookFactory.getBook("Harry Potter").getAuthor());
		JLabel label2 = new JLabel(", cd name: "+cdFactory.getCd("Californication").getName());
		JLabel label3 = new JLabel();
		label3.setIcon(cdFactory.getCd("Californication").getImage());	
		JLabel label4 = new JLabel("Author of Squee: "+comicFactory.getComic("Squee").getAuthor());
		JLabel label5 = new JLabel();
		label5.setIcon(comicFactory.getComic("Squee").getImage());
		centerPanel.add(label1);
		centerPanel.add(label2);
		centerPanel.add(label3);
		
		centerPanel.add(label4);
		centerPanel.add(label5);
		add(centerPanel);
		
		setBounds(200, 200, 600, 600);
		setVisible(true);
		
	}
	public static void main (String[]args) {
		new Library();
	}
}
