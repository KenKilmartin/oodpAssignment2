package oodpAssignment2;
import java.awt.*;
import javax.swing.*;

public class fileCommand implements Command {
   JFrame frame;

   public fileCommand(JFrame fr) {
      frame = fr;
   }
//------------------------------
   @SuppressWarnings("deprecation")
public void Execute() {
      FileDialog fDlg = new FileDialog(frame, "Open file");
      fDlg.show();
   }
}
