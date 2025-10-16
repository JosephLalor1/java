import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame
    {
        public static void insertBox()
            {
                String order = JOptionPane.showInputDialog("Enter new order for table: ");
                Operations.Insert("orders", order);
            }
        public ButtonFrame()
            {

                super("Delivery App");
                setLayout( new FlowLayout() );

                JButton clearButton = new JButton("Clear orders");
                clearButton.addActionListener(e -> Operations.Clear("orders"));
                
                JButton displayButton = new JButton("Display orders");
                displayButton.addActionListener(e -> Operations.Display("orders"));

                JButton insertButton = new JButton("Insert order");
                insertButton.addActionListener(e -> insertBox());
                
                add(displayButton);
                add(clearButton);
                add(insertButton);
            }
    }
