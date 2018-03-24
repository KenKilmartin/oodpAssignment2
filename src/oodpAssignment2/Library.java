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


		bookBtn = new CmdBtn("Books", this);
		bookBtn.addActionListener(this);
		bookBtn.setCommand(new BtnCommand(this, myCardLayout, swapPanelCards, "Book", "Library_Book"));

		cdBtn = new CmdBtn("CD's", this);
		cdBtn.addActionListener(this);
		cdBtn.setCommand(new BtnCommand(this, myCardLayout, swapPanelCards, "CD","Library_CD"));

		comicBookBtn = new CmdBtn("Comic", this);
		comicBookBtn.addActionListener(this);
		comicBookBtn.setCommand(new BtnCommand(this, myCardLayout, swapPanelCards, "ComicBook", "Library_ComicBook"));


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
		wrapTopPanel.setBackground(Color.PINK);  

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
		CommandHolder obj = (CommandHolder)e.getSource();
		obj.getCommand().Execute();
	}




	public static void main (String[]args) {
		new Library();
	}
}
