package oodpAssignment2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;


public class Library_Book extends JFrame implements ItemListener {

	private static final long serialVersionUID = 1L;
	private JPanel wrapPanel;
	private Checkbox harryPotter, hungerGames, metamorphosis, nineteenEightyFour, ulysses;
	Library frame;
	AbstractFactory factory;
	Book book;
	JTextArea bookInfoText;

	JLabel imageLabel;

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

		UIManager.put("OptionPane.background", new Color( 255,228,196));
		UIManager.put("Panel.background", new Color( 255,228,196));



		frame.swapPanelCards.add(wrapPanel, "Library_Book");

	}

	private JPanel buildCenterPanel() {
		JPanel centerPanel = new JPanel(new BorderLayout());
		centerPanel.setBackground (new Color( 255,228,196));

		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);//(top, left, bottom, right)

		centerPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.BLACK));


		JPanel bookBtnPanel = new JPanel(new GridLayout(1, 4));
		bookBtnPanel.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		bookBtnPanel.setBorder(emptyBorder);
		CheckboxGroup grp= new CheckboxGroup();

		harryPotter = new Checkbox("Harry Potter", grp, false);
		harryPotter.addItemListener(this);

		hungerGames = new Checkbox("Hunger Games", grp, false);
		hungerGames.addItemListener(this);

		metamorphosis = new Checkbox("Metamorphosis", grp, false);
		metamorphosis.addItemListener(this);

		nineteenEightyFour = new Checkbox("Nineteen Eighty-Four", grp, false);
		nineteenEightyFour.addItemListener(this);

		ulysses = new Checkbox("Ulysses", grp, false);
		ulysses.addItemListener(this);

		bookBtnPanel.add(harryPotter);
		bookBtnPanel.add(hungerGames);
		bookBtnPanel.add(metamorphosis);
		bookBtnPanel.add(nineteenEightyFour);
		bookBtnPanel.add(ulysses);

		centerPanel.add(bookBtnPanel, BorderLayout.NORTH);

		JPanel bookInfoPanel = makeBookInfoPanel();
		centerPanel.add(bookInfoPanel, BorderLayout.CENTER);
		return centerPanel;
	}

	public JPanel makeBookInfoPanel() {
		JPanel bInfoPanel = new JPanel(new BorderLayout());
		bookInfoText = new JTextArea(50, 50);
		bookInfoText.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		Border emptyBorder = BorderFactory.createEmptyBorder(10, 20, 10, 20);//(top, left, bottom, right)
		Border greenLine =  BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN);//(top, left, bottom, right)
		bookInfoText.setBorder(BorderFactory.createCompoundBorder(greenLine, emptyBorder));
		JScrollPane scroll = new JScrollPane(bookInfoText); 

		scroll.setBorder(emptyBorder);
		bookInfoText.setLineWrap(true);

		imageLabel = new JLabel();
		imageLabel.setBorder(emptyBorder);
		bInfoPanel.add(imageLabel, BorderLayout.WEST);
		bInfoPanel.add(scroll, BorderLayout.CENTER);
		bInfoPanel.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.ORANGE));

		return bInfoPanel;
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
				JOptionPane.showMessageDialog(frame, "You have chosen to rent "+book.getName(), "Enjoy!!", JOptionPane.PLAIN_MESSAGE);

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
		JLabel titleLabel = new JLabel("Books, books and more books!");
		titleLabel.setFont(new Font("Cooper Black", Font.PLAIN, 30));

		titleLabel.setBorder(BorderFactory.createEmptyBorder(50, 30, 10, 10)); //empty border (top, left, bottom, right)
		titleLabel.setForeground(Color.DARK_GRAY);

		topPanel.add(titleLabel);

		topPanel.setBorder(BorderFactory.createMatteBorder(0,0,3,0, Color.ORANGE));

		return topPanel;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getItem().equals("Harry Potter")){

			book=factory.getBook("Harry Potter");

		}else if(e.getItem().equals("Hunger Games")){
			book=factory.getBook("Hunger Games");

		}else if(e.getItem().equals("Metamorphosis")){
			book=factory.getBook("Metamorphosis");

		}else if(e.getItem().equals("Nineteen Eighty-Four")){
			book=factory.getBook("Nineteen Eighty-Four");

		}else if(e.getItem().equals("Ulysses")){
			book=factory.getBook("Ulysses");

		}
		clearBookInfo();
		setBookInfo();
	}

	private void setBookInfo() {
		if (book != null) {
			imageLabel.setIcon(book.getImage());
			bookInfoText.setText(book.getName()+"\n");
			bookInfoText.append("\nAuthor: "+book.getAuthor()+"\n");
			bookInfoText.append("\nDescription\n"+book.getDesc());

		}

	}

	private void clearBookInfo() {
		bookInfoText.setText("");
		imageLabel.setIcon(null);
	}



}
