package oodpAssignment2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;


public class Library_ComicBook extends JFrame implements ItemListener {

	private static final long serialVersionUID = 1L;
	private JPanel wrapPanel;
	private Checkbox squee, slaine, spiderMan, garfield;
	Library frame;
	AbstractFactory factory;
	ComicBook comicBook;
	JTextArea comicBookInfoText;

	JLabel imageLabel;

	public Library_ComicBook(Library frame, AbstractFactory factory){
		this.frame=frame;
		this.factory = factory;
		wrapPanel = new JPanel(new BorderLayout());
		JPanel topPanel = (buildTopPanel());
		JPanel centerPanel = (buildCenterPanel());

		JPanel bottomPanel = (buildbottomPanel());

		wrapPanel.add(topPanel, BorderLayout.NORTH);
		wrapPanel.add(centerPanel, BorderLayout.CENTER);
		wrapPanel.add(bottomPanel, BorderLayout.SOUTH);

		UIManager.put("OptionPane.background", new Color( 255,228,196));
		UIManager.put("Panel.background", new Color( 255,228,196));



		frame.swapPanelCards.add(wrapPanel, "Library_ComicBook");

	} ///210,180,140

	private JPanel buildCenterPanel() {
		JPanel centerPanel = new JPanel(new BorderLayout());
		centerPanel.setBackground(new Color(255,228,196 ));

		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);//(top, left, bottom, right)

		centerPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.BLACK));


		JPanel comicBookBtnPanel = new JPanel(new GridLayout(1, 4));
		comicBookBtnPanel.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		comicBookBtnPanel.setBorder(emptyBorder);
		CheckboxGroup grp= new CheckboxGroup();

		squee = new Checkbox("Squee", grp, false);
		squee.addItemListener(this);

		slaine = new Checkbox("Slaine", grp, false);
		slaine.addItemListener(this);

		spiderMan = new Checkbox("SpiderMan", grp, false);
		spiderMan.addItemListener(this);

		garfield = new Checkbox("Garfield", grp, false);
		garfield.addItemListener(this);

	

		comicBookBtnPanel.add(squee);
		comicBookBtnPanel.add(slaine);
		comicBookBtnPanel.add(spiderMan);
		comicBookBtnPanel.add(garfield);
	

		centerPanel.add(comicBookBtnPanel, BorderLayout.NORTH);

		JPanel bookInfoPanel = makeBookInfoPanel();
		centerPanel.add(bookInfoPanel, BorderLayout.CENTER);
		return centerPanel;
	}

	public JPanel makeBookInfoPanel() {
		JPanel cInfoPanel = new JPanel(new BorderLayout());
		comicBookInfoText = new JTextArea(50, 50);
		comicBookInfoText.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		Border emptyBorder = BorderFactory.createEmptyBorder(10, 20, 10, 20);//(top, left, bottom, right)
		Border greenLine =  BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN);//(top, left, bottom, right)
		comicBookInfoText.setBorder(BorderFactory.createCompoundBorder(greenLine, emptyBorder));
		JScrollPane scroll = new JScrollPane(comicBookInfoText); 

		scroll.setBorder(emptyBorder);
		comicBookInfoText.setLineWrap(true);

		imageLabel = new JLabel();
		imageLabel.setBorder(emptyBorder);
		cInfoPanel.add(imageLabel, BorderLayout.WEST);
		cInfoPanel.add(scroll, BorderLayout.CENTER);
		cInfoPanel.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.ORANGE));

		return cInfoPanel;
	}

	private JPanel buildbottomPanel() {
		JPanel bottomPanel = new JPanel();
		Border greenLine =  BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN);//(top, left, bottom, right)
		Border emptyBorder = BorderFactory.createEmptyBorder(10, 80, 10, 80);//(top, left, bottom, right)

		JButton backButton = new JButton("Back");
		backButton.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		backButton.setBackground(new Color( 210,180,140));
		backButton.setBorder(BorderFactory.createCompoundBorder(greenLine, emptyBorder));
		backButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				frame.myCardLayout.show(frame.swapPanelCards, "Library");

			}
		});
		JButton rentButton = new JButton("Rent");
		rentButton.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		rentButton.setBackground(new Color( 210,180,140));
		rentButton.setBorder(BorderFactory.createCompoundBorder(greenLine, emptyBorder));
		rentButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				UIManager.put("OptionPane.background", new Color( 255,228,196));
				UIManager.put("Panel.background", new Color( 255,228,196));
				JOptionPane.showMessageDialog(frame, "You have chosen to rent "+comicBook.getComic(), "Enjoy!!", JOptionPane.PLAIN_MESSAGE);

			}
		});

		bottomPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		bottomPanel.setBackground(new Color( 255,228,196));

		bottomPanel.add(backButton);
		bottomPanel.add(rentButton);

		return bottomPanel;
	}

	private JPanel buildTopPanel() {
		JPanel topPanel = new JPanel(new BorderLayout());
		topPanel.setBackground(new Color( 255,228,196));

		JLabel titleLabel = new JLabel("Welcome to the wonderful world of Comic Books...");
		titleLabel.setFont(new Font("Cooper Black", Font.PLAIN, 30));

		titleLabel.setBorder(BorderFactory.createEmptyBorder(50, 30, 10, 10)); //empty border (top, left, bottom, right)
		titleLabel.setForeground(Color.DARK_GRAY);

		topPanel.add(titleLabel);

		topPanel.setBorder(BorderFactory.createMatteBorder(0,0,3,0, Color.ORANGE));

		return topPanel;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getItem().equals("Squee")){

			comicBook=factory.getComic("Squee");

		}else if(e.getItem().equals("Slaine")){
			comicBook=factory.getComic("Slaine");

		}else if(e.getItem().equals("SpiderMan")){
			comicBook=factory.getComic("SpiderMan");

		}else if(e.getItem().equals("Garfield")){
			comicBook=factory.getComic("Garfield");

		}
		clearComicBookInfo();
		setComicBookInfo();
	}

	private void setComicBookInfo() {
		if (comicBook != null) {
			imageLabel.setIcon(comicBook.getComicImage());
			comicBookInfoText.setText(comicBook.getComic()+"\n");
			comicBookInfoText.append("\nAuthor: "+comicBook.getComicAuthor()+"\n");
			comicBookInfoText.append("\nDescription\n"+comicBook.getComicDesc());

		}

	}

	private void clearComicBookInfo() {
		comicBookInfoText.setText("");
		imageLabel.setIcon(null);
	}



}
