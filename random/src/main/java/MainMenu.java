import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainMenu extends JFrame
    {
        private JButton clearButton, displayButton;
        private RestaurantAd insertButton;
        public static void open()
            {
                MainMenu buttonFrame = new MainMenu();
                buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                buttonFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                buttonFrame.setVisible(true);
                buttonFrame.setLocationRelativeTo(null);
                buttonFrame.updateButtonSizes();              
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
                ImageIcon food1 = new ImageIcon(MainMenu.class.getResource("/images/icons/food1.jpg"));

                JButton clearButton = new JButton("Clear orders");
                clearButton.addActionListener(e -> Operations.Clear("orders"));
                
                JButton displayButton = new JButton("Display orders");
                displayButton.addActionListener(e -> displayBox());

                RestaurantAd insertButton = new RestaurantAd("Insert order", "heelo", food1);
                insertButton.addActionListener(e -> insertBox());
                
                add(insertButton);
                add(displayButton);
                add(clearButton);
                

            }
        private void updateButtonSizes() 
            {
                int WIDTH = (int) (this.getWidth() * 0.8); 
                int HEIGHT = 200;
                
                displayButton.setPreferredSize(new Dimension(WIDTH, HEIGHT));
                clearButton.setPreferredSize(new Dimension(WIDTH, HEIGHT));
                insertButton.setPreferredSize(new Dimension(WIDTH, HEIGHT));
                
                revalidate(); 
                repaint();    
            }
    }
