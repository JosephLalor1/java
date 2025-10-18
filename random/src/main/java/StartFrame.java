import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
public class StartFrame 
    {
        public static void startFrame()
            {
                ImageIcon welcome = new ImageIcon(StartFrame.class.getResource("/images/icons/Welcome!.gif"));
                JFrame starter = new JFrame("Welcome!");
                JLabel label = new JLabel(welcome);
                
                starter.setSize(1152, 648);
                starter.setVisible(true);
                starter.setLocationRelativeTo(null);
                starter.add(label);

                Timer timer = new Timer(5000, e -> {
                    starter.dispose();
                    Operations.Connect();
                    MainMenu.open();
                });
                timer.setRepeats(false);
                timer.start();
           
            }
    }
