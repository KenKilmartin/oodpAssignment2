package oodpAssignment2;
import java.awt.*;
import javax.swing.*;

public class BtnCommand extends JButton implements Command {
	
	private static final long serialVersionUID = 1L;
	Library frame;
	private AbstractFactory factory;
	CardLayout myCardLayout;
	JPanel swapPanelCards;
	String factorySt, cardName;


	public BtnCommand(Library fr, CardLayout cardLayout, JPanel panel, String fac, String cardName) {
		frame = fr;
		myCardLayout = cardLayout;
		swapPanelCards = panel;
		factorySt = fac;
		this.cardName = cardName;
	}
	//------------------------------
	public void Execute() {
		factory = FactoryProducer.getFactory(factorySt);
		
		
		//create a new Library_Book page and pass it this frame
		new Library_Book(frame, factory);
		new Library_CD(frame, factory);
		new Library_ComicBook(frame, factory);
		
		//show the Library_Book page
		myCardLayout.show(swapPanelCards, cardName);
		
	}
}
