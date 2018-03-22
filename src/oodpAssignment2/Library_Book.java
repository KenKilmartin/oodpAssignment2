package oodpAssignment2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;


public class Library_Book extends JFrame implements ItemListener {
	private JPanel wrapPanel;
	private Checkbox harryPotter, hungerGames, metamorphosis, nineteenEightyFour, ulysses;
	Library frame;
	AbstractFactory factory;
	
	public Library_Book(Library frame, AbstractFactory factory){
		this.frame=frame;
		this.factory = factory;
		wrapPanel = new JPanel(new BorderLayout());
		JPanel topPanel = (buildTopPanel());
		JPanel centerPanel = (buildCenterPanel());
	
		JPanel bottomPanel = (buildbottomPanel());
		
		wrapPanel.add(topPanel, BorderLayout.NORTH);
		wrapPanel.add(centerPanel, BorderLayout.CENTER);
		wrapPanel.add(bottomPanel, BorderLayout.SOUTH);
		
		UIManager.put("OptionPane.background", Color.PINK);
		UIManager.put("Panel.background", Color.PINK);
		
		
		
		frame.swapPanelCards.add(wrapPanel, "Library_Book");

	}

	private JPanel buildCenterPanel() {
		JPanel centerPanel = new JPanel(new BorderLayout());
		centerPanel.setBackground(Color.PINK);


		centerPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.BLACK));

		
		JPanel bookBtnPanel = new JPanel(new GridLayout(1, 4));
		CheckboxGroup grp= new CheckboxGroup();
		
		
		harryPotter = new Checkbox("Harry Potter", grp, false);
		harryPotter.addItemListener(this);
		
		hungerGames = new Checkbox("Hunger Games", grp, false);
		hungerGames.addItemListener(this);
		
		metamorphosis = new Checkbox("Metamorphosis", grp, false);
		metamorphosis.addItemListener(this);
		
		nineteenEightyFour = new Checkbox("Nineteen Eithy-Four", grp, false);
		nineteenEightyFour.addItemListener(this);
		
		ulysses = new Checkbox("Ulysses", grp, false);
		ulysses.addItemListener(this);
		
		bookBtnPanel.add(harryPotter);
		bookBtnPanel.add(hungerGames);
		bookBtnPanel.add(metamorphosis);
		bookBtnPanel.add(nineteenEightyFour);
		bookBtnPanel.add(ulysses);
		
		centerPanel.add(bookBtnPanel, BorderLayout.CENTER);
		return centerPanel;
	}

	private JPanel buildbottomPanel() {
		JPanel bottomPanel = new JPanel();
		Border greenLine =  BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN);//(top, left, bottom, right)
		Border emptyBorder = BorderFactory.createEmptyBorder(10, 80, 10, 80);//(top, left, bottom, right)
		
		JButton backButton = new JButton("Back");
		backButton.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		backButton.setForeground(Color.DARK_GRAY);
		backButton.setBorder(BorderFactory.createCompoundBorder(greenLine, emptyBorder));
		backButton.addActionListener(new ActionListener() {
						
			public void actionPerformed(ActionEvent e) {
				frame.myCardLayout.show(frame.swapPanelCards, "Library");
				
			}
		});
		JButton rentButton = new JButton("Rent");
		rentButton.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		rentButton.setForeground(Color.DARK_GRAY);
		rentButton.setBorder(BorderFactory.createCompoundBorder(greenLine, emptyBorder));
		rentButton.addActionListener(new ActionListener() {
						
			public void actionPerformed(ActionEvent e) {
				//TODO: 
				System.out.println("You have rented ***** books./n show in a dialog");
				
			}
		});
		
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		bottomPanel.setBackground(Color.PINK);
		
		bottomPanel.add(backButton);
		bottomPanel.add(rentButton);

		return bottomPanel;
	}

	private JPanel buildTopPanel() {
		JPanel topPanel = new JPanel(new BorderLayout());
		topPanel.setBackground(Color.PINK);
		
		JLabel titleLabel = new JLabel("Books, books and more books!");
		titleLabel.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		
		titleLabel.setBorder(BorderFactory.createEmptyBorder(50, 30, 10, 10)); //empty border (top, left, bottom, right)
		titleLabel.setForeground(Color.DARK_GRAY);
		
		topPanel.add(titleLabel);

		topPanel.setBorder(BorderFactory.createMatteBorder(0,0,3,0, Color.CYAN));
	
		return topPanel;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getItem().equals("Harry Potter")){
			
			factory.getBook("Harry Potter");
		
		}else if(e.getItem().equals("Hunger Games")){
			
		}else if(e.getItem().equals("Metamorphosis")){
			
		}else if(e.getItem().equals("Nineteen Eithy-Four")){
			
		}else if(e.getItem().equals("Ulysses")){
			
		}
		
	}
	

}
