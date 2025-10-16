import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
public class StartFrame 
    {
        public static void startFrame()
            {
                JFrame starter = new JFrame("Welcome!");
                starter.setSize(300, 300);
                starter.setVisible(true);
                starter.add(new JLabel(new ImageIcon("images/icons/Welcome!.gif")));

                Timer timer = new Timer(5000, e -> {
                    starter.dispose();
                });                
            }
    }
