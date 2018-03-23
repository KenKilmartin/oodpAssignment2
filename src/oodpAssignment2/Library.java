package oodpAssignment2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

public class Library extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	private AbstractFactory factory;
	CmdBtn bookBtn, cdBtn, comicBookBtn, logoutBtn;
	Frame myFrame;
	JMenu mnuFile;
	CmdMenu  mnuOpen;
	
	
	//setting up Card Layout
	CardLayout myCardLayout;
	JPanel swapPanelCards, wrapMainScreenPanel;
	
	public Library() {
		super("Library");
		setSize(1400,800);
		myFrame = new Frame();
		
		JMenuBar mbar = new JMenuBar();
		setJMenuBar(mbar);
		
		mnuFile = new JMenu("File", true);
		mbar.add(mnuFile);
	
		mnuOpen = new CmdMenu("Open...", this);
		mnuFile.add(mnuOpen);
		
		mnuOpen.addActionListener(this);
		mnuOpen.setCommand (new fileCommand(this));
		
		myCardLayout = new CardLayout();
		swapPanelCards = new JPanel(myCardLayout);
		
		JPanel topPanel = (buildTopPanel());
		JPanel bottomPanel = (buildBottomPanel());
		
		wrapMainScreenPanel = new JPanel(new BorderLayout());	
		wrapMainScreenPanel.add(topPanel, BorderLayout.NORTH);
		wrapMainScreenPanel.add(bottomPanel, BorderLayout.CENTER);
		
		swapPanelCards.add(wrapMainScreenPanel, "Library");
		
		
		add(swapPanelCards);
		myCardLayout.show(swapPanelCards,"homeScreen");
	    setLocationRelativeTo(null);	//put to center of the screen
	    setResizable(false);
		setVisible(true);
	 
	}
	private JPanel buildBottomPanel() {
		JPanel buttonPanel = new JPanel(new GridLayout(2,3,70,90)); //GridLayout(rows, columns, horizontal gap, vertical gap)
		Border emptyBorder = BorderFactory.createEmptyBorder(150, 70, 150, 70);
		Border topLineBorder =  BorderFactory.createMatteBorder(3, 0, 0, 0, Color.CYAN);

		Border greenLine =  BorderFactory.createMatteBorder(3, 3, 3, 3, Color.GREEN);//(top, left, bottom, right)
		Border emptyBorder2 = BorderFactory.createEmptyBorder(35, 25, 35, 25);//(top, left, bottom, right)
				
//		ImageIcon bookIcon = new ImageIcon("images/book.jpg");  
//		bookBtn = new JButton(bookIcon);
//		bookBtn = new JButton("Book");
		
		
//		bookBtn.setFont(new Font("Lucida Sans", Font.BOLD, 26));
//		bookBtn.setForeground(Color.DARK_GRAY);
//		bookBtn.setBorder(BorderFactory.createCompoundBorder(greenLine, emptyBorder2));
		bookBtn = new CmdBtn("Books", this);
		bookBtn.addActionListener(this);
		bookBtn.setCommand(new BtnCommand(this, myCardLayout, swapPanelCards, "Book", "Library_Book"));
	
//		ImageIcon cdIcon = new ImageIcon("images/cd.jpg"); 
//		cdBtn = new JButton(cdIcon);
//		cdBtn = new JButton("CD");
//		cdBtn.setFont(new Font("Lucida Sans", Font.BOLD, 26));
//		cdBtn.setForeground(Color.DARK_GRAY);
//		cdBtn.setBorder(BorderFactory.createCompoundBorder(greenLine, emptyBorder2));
		cdBtn = new CmdBtn("CD's", this);
		cdBtn.addActionListener(this);
		cdBtn.setCommand(new BtnCommand(this, myCardLayout, swapPanelCards, "CD","Library_CD"));

//		ImageIcon comicBookIcon = new ImageIcon("images/comic.jpg"); 
//		comicBookBtn = new JButton(comicBookIcon);
//		comicBookBtn = new JButton("Comic Book");
//		comicBookBtn.setFont(new Font("Lucida Sans", Font.BOLD, 26));
//		comicBookBtn.setForeground(Color.DARK_GRAY);
//		comicBookBtn.setBorder(BorderFactory.createCompoundBorder(greenLine, emptyBorder2));
		comicBookBtn = new CmdBtn("Comic", this);
		comicBookBtn.addActionListener(this);
		comicBookBtn.setCommand(new BtnCommand(this, myCardLayout, swapPanelCards, "ComicBook", "Library_ComicBook"));

//		ImageIcon logoutIcon = new ImageIcon("images/logout.jpg"); 
//		logOutBtn = new JButton(logoutIcon);
//		logOutBtn = new JButton("Log Out");
//		logOutBtn.setFont(new Font("Lucida Sans", Font.BOLD, 26));
//		logOutBtn.setForeground(Color.DARK_GRAY);
//		logOutBtn.setBorder(BorderFactory.createCompoundBorder(greenLine, emptyBorder2));
		
		logoutBtn = new CmdBtn("Log Out", this);
		logoutBtn.addActionListener(this);
		logoutBtn.setCommand(new LogoutBtnCommand(this, myFrame));
		
		buttonPanel.add(bookBtn);
		buttonPanel.add(cdBtn);
		buttonPanel.add(comicBookBtn);

		buttonPanel.add(logoutBtn);
		
		buttonPanel.setBackground(Color.PINK);
		buttonPanel.setBorder(BorderFactory.createCompoundBorder(topLineBorder, emptyBorder));
		
		return buttonPanel;
	}
	
	private JPanel buildTopPanel() {
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		JPanel wrapTopPanel = new JPanel(new BorderLayout());
		wrapTopPanel.setBackground(Color.PINK);  //HAHAHAHAHA Kens fav colour
		
		JLabel welcomeLabel = new JLabel("Welcome to the Best Library Ever!");
		welcomeLabel.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		//empty border around the welcome (top, left, bottom, right)
		welcomeLabel.setBorder(BorderFactory.createEmptyBorder(50, 30, 10, 10));
		welcomeLabel.setForeground(Color.DARK_GRAY);
		leftPanel.setBackground(Color.PINK);
		
		JLabel promptLabel = new JLabel("What would you like to Rent?");
		promptLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		promptLabel.setBorder(BorderFactory.createEmptyBorder(50, 10, 20, 10));//(top, left, bottom, right)
		rightPanel.setBackground(Color.PINK);
		
		leftPanel.add(welcomeLabel);
		rightPanel.add(promptLabel);
		wrapTopPanel.add(leftPanel, BorderLayout.WEST);
		wrapTopPanel.add(rightPanel, BorderLayout.EAST);
		
		return wrapTopPanel;
	}
	
	public void actionPerformed(ActionEvent e)   {
//		
//		if(e.getSource()==logOutBtn){
//
//			this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));//to close the GUI	
//			UIManager.put("OptionPane.background", Color.PINK);
//			UIManager.put("Panel.background", Color.pink);
//			JOptionPane.showMessageDialog(myFrame, "You have now Logged Out", "Good-Bye", JOptionPane.PLAIN_MESSAGE);
//			System.exit(0);//this stops the program running in the background
//		
//		}else if(e.getSource()==bookBtn){
//			
//			factory = FactoryProducer.getFactory("Book");
//				
//			//create a new Library_Book page and pass it this frame
//			new Library_Book(this, factory);
//			
//			//show the Library_Book page
//			myCardLayout.show(swapPanelCards,"Library_Book");
//		
//		}else if(e.getSource()==cdBtn){
//			factory = FactoryProducer.getFactory("CD");
//			
//			//create a new Library_Book page and pass it this frame
//			new Library_CD(this, factory);
//			
//			//show the Library_Book page
//			myCardLayout.show(swapPanelCards,"Library_CD");
//		}else if(e.getSource()==comicBookBtn){
//			
//			factory = FactoryProducer.getFactory("ComicBook");
//			
//			//create a new Library_Book page and pass it this frame
//			new Library_ComicBook(this, factory);
//			
//			//show the Library_Book page
//			myCardLayout.show(swapPanelCards,"Library_ComicBook");
//		}		
		
		//the command code---
		CommandHolder obj = (CommandHolder)e.getSource();
		obj.getCommand().Execute();
	}
	
	
	
	
	public static void main (String[]args) {
		new Library();
	}
}
