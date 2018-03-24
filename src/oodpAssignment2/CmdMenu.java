package oodpAssignment2;
import javax.swing.*;

public class CmdMenu extends JMenuItem implements CommandHolder {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
protected Command menuCommand;
   protected JFrame frame;
//-----------------------
   public CmdMenu(String name, JFrame frm) {
      super(name);
      frame = frm;
   }
//-----------------------
   public void setCommand(Command comd) {
      menuCommand = comd;
   }
//-----------------------
   public Command getCommand() {
      return menuCommand;
   }
}
