package oodpAssignment2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;


public class Library_CD extends JFrame implements ItemListener {


	private static final long serialVersionUID = 1L;
	private JPanel wrapPanel;
	private Checkbox americanIdiot, californication, nevermind, moonSafari;

	Library frame;
	AbstractFactory factory;
	Cd cd;
	JTextArea cdInfoText;

	JLabel imageLabel;

	public Library_CD(Library frame, AbstractFactory factory){
		this.frame=frame;
		this.factory = factory;
		wrapPanel = new JPanel(new BorderLayout());
		JPanel topPanel = (buildTopPanel());
		JPanel centerPanel = (buildCenterPanel());

		JPanel bottomPanel = (buildbottomPanel());

		wrapPanel.add(topPanel, BorderLayout.NORTH);
		wrapPanel.add(centerPanel, BorderLayout.CENTER);
		wrapPanel.add(bottomPanel, BorderLayout.SOUTH);

		UIManager.put("OptionPane.background",new Color( 255,228,196));
		UIManager.put("Panel.background", new Color( 255,228,196));



		frame.swapPanelCards.add(wrapPanel, "Library_CD");

	}

	private JPanel buildCenterPanel() {
		JPanel centerPanel = new JPanel(new BorderLayout());
		centerPanel.setBackground(new Color( 255,228,196));

		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);//(top, left, bottom, right)

		centerPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.BLACK));


		JPanel cdBtnPanel = new JPanel(new GridLayout(1, 4));
		cdBtnPanel.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		cdBtnPanel.setBorder(emptyBorder);
		CheckboxGroup grp= new CheckboxGroup();

		americanIdiot = new Checkbox("American Idiot", grp, false);
		americanIdiot.addItemListener(this);

		californication = new Checkbox("Californication", grp, false);
		californication.addItemListener(this);

		moonSafari = new Checkbox("Moon Safari", grp, false);
		moonSafari.addItemListener(this);

		nevermind = new Checkbox("Nevermind", grp, false);
		nevermind.addItemListener(this);


		cdBtnPanel.add(americanIdiot);
		cdBtnPanel.add(californication);
		cdBtnPanel.add(nevermind);
		cdBtnPanel.add(moonSafari);

		centerPanel.add(cdBtnPanel, BorderLayout.NORTH);

		JPanel cdInfoPanel = makeCdInfoPanel();
		centerPanel.add(cdInfoPanel, BorderLayout.CENTER);
		return centerPanel;
	}

	public JPanel makeCdInfoPanel() {
		JPanel cdInfoPanel = new JPanel(new BorderLayout());
		cdInfoText = new JTextArea(50, 50);
		cdInfoText.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		Border emptyBorder = BorderFactory.createEmptyBorder(10, 20, 10, 20);//(top, left, bottom, right)
		Border greenLine =  BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN);//(top, left, bottom, right)
		cdInfoText.setBorder(BorderFactory.createCompoundBorder(greenLine, emptyBorder));
		JScrollPane scroll = new JScrollPane(cdInfoText); 

		scroll.setBorder(emptyBorder);
		cdInfoText.setLineWrap(true);

		imageLabel = new JLabel();
		imageLabel.setBorder(emptyBorder);
		cdInfoPanel.add(imageLabel, BorderLayout.WEST);
		cdInfoPanel.add(scroll, BorderLayout.CENTER);
		cdInfoPanel.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.ORANGE));

		return cdInfoPanel;
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
				UIManager.put("OptionPane.background", new Color( 210,180,140));
				UIManager.put("Panel.background", new Color( 210,180,140));
				JOptionPane.showMessageDialog(frame, "You have chosen to rent "+cd.getName(), "Enjoy!!", JOptionPane.PLAIN_MESSAGE);

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

		JLabel titleLabel = new JLabel("So many awesome CD's, how will you ever choose!?");
		titleLabel.setFont(new Font("Cooper Black", Font.PLAIN, 30));

		titleLabel.setBorder(BorderFactory.createEmptyBorder(50, 30, 10, 10)); //empty border (top, left, bottom, right)
		titleLabel.setForeground(Color.DARK_GRAY);

		topPanel.add(titleLabel);

		topPanel.setBorder(BorderFactory.createMatteBorder(0,0,3,0, Color.ORANGE));

		return topPanel;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getItem().equals("American Idiot")){

			cd=factory.getCd("American Idiot");

		}else if(e.getItem().equals("Californication")){
			cd=factory.getCd("Californication");

		}else if(e.getItem().equals("Nevermind")){
			cd=factory.getCd("Nevermind");

		}else if(e.getItem().equals("Moon Safari")){
			cd=factory.getCd("Moon Safari");

		}else if(e.getItem().equals("Nineteen Eighty-Four")){
			cd=factory.getCd("Nineteen Eighty-Four");

		}else if(e.getItem().equals("Ulysses")){
			cd=factory.getCd("Ulysses");

		}
		clearCDInfo();
		setCDInfo();
	}

	private void setCDInfo() {
		if (cd != null) {
			imageLabel.setIcon(cd.getImage());
			cdInfoText.setText("Band: "+cd.getBandName()+"\n"+ "\nAlbumn Name: " + cd.getName()+"\n");   		
			cdInfoText.append("\nTracks: \n");
			for (int i = 0; i < cd.getTracks().size(); i++) {
				cdInfoText.append((i+1)+": "+cd.getTracks().get(i)+"\n");
			}



		}

	}

	private void clearCDInfo() {
		cdInfoText.setText("");
		imageLabel.setIcon(null);
	}



}
