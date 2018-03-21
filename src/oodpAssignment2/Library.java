package oodpAssignment2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Library extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AbstractFactory bookFactory, cdFactory,comicFactory;
	JMenu mnuFile;
	cmdMenu  mnuOpen;
	

	
	public Library() {
		super("Library");
		bookFactory = FactoryProducer.getFactory("Book");
		cdFactory = FactoryProducer.getFactory("CD");
		comicFactory = FactoryProducer.getFactory("ComicBook");
		makeGUI();
	}
	private void makeGUI() {
		JPanel centerPanel = new JPanel();
//		JLabel label1 = new JLabel("Author of harry potter: "+bookFactory.getBook("1984").getAuthor());
//		JLabel label2 = new JLabel(", cd name: "+cdFactory.getCd("Californication").getName());
//		JLabel label3 = new JLabel();
//		label3.setIcon(cdFactory.getCd("Californication").getImage());	
//		JLabel label4 = new JLabel("Author of Squee: "+comicFactory.getComic("Squee").getComicAuthor());
//		JLabel label5 = new JLabel();
//		label5.setIcon(comicFactory.getComic("Squee").getComicImage());
//		centerPanel.add(label1);
//		centerPanel.add(label2);
//		centerPanel.add(label3);
//		
//		centerPanel.add(label4);
//		centerPanel.add(label5);
		
		JMenuBar mbar = new JMenuBar();
		setJMenuBar(mbar);
		
		mnuFile = new JMenu("File", true);
		mbar.add(mnuFile);
		
		getContentPane().add(centerPanel);
	

		mnuOpen = new cmdMenu("Open...", this);
		mnuFile.add(mnuOpen);
		
		
		
//		
//		add(centerPanel);
		
		setBounds(200, 200, 600, 600);
		setVisible(true);
		
	}public void actionPerformed(ActionEvent e)   {
		CommandHolder obj = (CommandHolder)e.getSource();
		obj.getCommand().Execute();
	}
	
	
	public static void main (String[]args) {
		new Library();
	}
}
