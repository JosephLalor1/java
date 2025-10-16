import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
public class StartFrame 
    {
        public static void startFrame() throws MalformedURLException
            {
                JFrame starter = new JFrame("Welcome!");
                URL url = new URL("images/icons/Welcome!.gif");
                starter.setSize(300, 300);
                starter.setVisible(true);
                starter.add(new JLabel(new ImageIcon(url)));

                Timer timer = new Timer(5000, e -> {
                    starter.dispose();
                });
                timer.setRepeats(false);
                timer.start();              
            }
    }
