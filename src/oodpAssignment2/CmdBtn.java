package oodpAssignment2;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class CmdBtn extends JButton implements CommandHolder {
	protected Command btnCommand;
	protected JFrame frame;
	//-----------------------
	public CmdBtn(String name, JFrame frm) {
		super(name);
		frame = frm;

		Border greenLine =  BorderFactory.createMatteBorder(3, 3, 3, 3, Color.GREEN);//(top, left, bottom, right)
		Border emptyBorder1 = BorderFactory.createEmptyBorder(35, 25, 35, 25);//(top, left, bottom, right)

		setFont(new Font("Lucida Sans", Font.BOLD, 26));
		setForeground(Color.DARK_GRAY);
		setBorder(BorderFactory.createCompoundBorder(greenLine, emptyBorder1));
		setText(name);
	}
	//-----------------------
	public void setCommand(Command comd) {
		btnCommand = comd;
	}
	//-----------------------
	public Command getCommand() {
		return btnCommand;
	}
}
