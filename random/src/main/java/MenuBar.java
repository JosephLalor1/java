import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuBar extends JPanel
    {
        public MenuBar() 
            {
                this.setLayout(new GridLayout(1, 4));
                add(new JButton("Home"));
                add(new JButton("My Orders"));
                add(new JButton("My Account"));
                add(new JButton("Exit"));
            }
    }
