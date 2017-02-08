package Code;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game extends JFrame {

      public static void main(String[] args) {
            JFrame AnfangFrame = new JFrame("JumpnRun");
            AnfangFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);                         // Der Frame wird Full Screen.
            AnfangFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                  // Bei schliessung des Frames beendet das Programm.
            AnfangFrame.getContentPane().setBackground(Color.black);                     // Schwarzer Hintergrund
            AnfangFrame.setVisible(true);
             
            JLabel tutorial = new JLabel("tutorial");
            tutorial.setText("Tutorial:");
            tutorial.setForeground(Color.red);
            AnfangFrame.add(tutorial);
           
      }		

}

