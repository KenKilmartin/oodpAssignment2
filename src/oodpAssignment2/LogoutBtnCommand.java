package oodpAssignment2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LogoutBtnCommand extends JButton implements Command {


	private static final long serialVersionUID = 1L;
	JFrame frame;
	Frame myFrame;

	public LogoutBtnCommand(JFrame fr, Frame myFr) {
		frame = fr;
		myFrame= myFr;
	}
	//------------------------------
	public void Execute() {
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));//to close the GUI	
		UIManager.put("OptionPane.background", Color.PINK);
		UIManager.put("Panel.background", Color.pink);
		JOptionPane.showMessageDialog(myFrame, "You have now Logged Out", "Good-Bye", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);//this stops the program running in the background
	}
}
