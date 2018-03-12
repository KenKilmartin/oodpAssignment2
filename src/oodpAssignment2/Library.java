package oodpAssignment2;

import java.awt.*;

import javax.swing.*;

public class Library extends JFrame{

	private Container c;
	private AbstractFactory bookFactory, cdFactory;
	public Library() {
		super("Library");
		c = getContentPane();
		bookFactory = FactoryProducer.getFactory("Book");
		cdFactory = FactoryProducer.getFactory("CD");
		makeGUI();
	}
	private void makeGUI() {
		JPanel centerPanel = new JPanel();
		JLabel label1 = new JLabel(bookFactory.getBook("Harry Potter").getAuthor());
		JLabel label2 = new JLabel(cdFactory.getCd("Californication").getName());
		centerPanel.add(label1);
		centerPanel.add(label2);
		c.add(centerPanel);
		
		c.setBounds(600, 600, 600, 600);
		c.setVisible(true);
		
	}
	public static void main (String[]args) {
		new Library();
	}
}