package oodpAssignment2;

import java.awt.*;

import javax.swing.*;

public class Library extends JFrame{

	private AbstractFactory bookFactory, cdFactory;
	
//	should be:
//	private AbstractFactory factory;
//	and then in program-if book clicked then: factory = FactoryProducer.getFactory("Book");
	
	public Library() {
		super("Library");
		bookFactory = FactoryProducer.getFactory("Book");
		cdFactory = FactoryProducer.getFactory("CD");
		makeGUI();
	}
	private void makeGUI() {
		JPanel centerPanel = new JPanel();
		JLabel label1 = new JLabel("Author of harry potter: "+bookFactory.getBook("Harry Potter").getAuthor());
		JLabel label2 = new JLabel(", cd name: "+cdFactory.getCd("Californication").getName());
		JLabel label3 = new JLabel();
		label3.setIcon(cdFactory.getCd("Californication").getImage());
		centerPanel.add(label1);
		centerPanel.add(label2);
		centerPanel.add(label3);
		add(centerPanel);
		
		setBounds(200, 200, 600, 600);
		setVisible(true);
		
	}
	public static void main (String[]args) {
		new Library();
	}
}
