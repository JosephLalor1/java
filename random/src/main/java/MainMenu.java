import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainMenu extends JFrame
    {
        public static void open()
            {
                MainMenu buttonFrame = new MainMenu();
                buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                buttonFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                buttonFrame.setVisible(true);
                buttonFrame.setLocationRelativeTo(null);                
            }
        public static void insertBox()
            {
                String order = JOptionPane.showInputDialog("Enter new order for table: ");
                Operations.Insert("orders", order);
            }
        public void displayBox()
            {
                JOptionPane.showMessageDialog(MainMenu.this, Operations.Display("orders"));
            }
        public MainMenu()
            {

                super("Delivery App");
                setLayout( new FlowLayout() );

                JButton clearButton = new JButton("Clear orders");
                clearButton.addActionListener(e -> Operations.Clear("orders"));
                
                JButton displayButton = new JButton("Display orders");
                displayButton.addActionListener(e -> displayBox());

                JButton insertButton = new JButton("Insert order");
                insertButton.addActionListener(e -> insertBox());
                
                add(displayButton);
                add(clearButton);
                add(insertButton);
            }
    }
