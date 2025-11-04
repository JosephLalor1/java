import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class MainMenu extends JFrame
    {
        //private JButton clearButton, displayButton;
        private JPanel panel = new JPanel();
        private int numAds = 7;
        private RestaurantAd[] ads = new RestaurantAd[numAds];
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

                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setExtendedState(JFrame.MAXIMIZED_BOTH);
                panel.setLayout(new FlowLayout());
                
                JScrollPane scroller = new JScrollPane(panel);
                
                panel.setPreferredSize(this.getSize());
                scroller.setPreferredSize(panel.getSize());
                
                 

                ImageIcon food1 = new ImageIcon(MainMenu.class.getResource("/images/icons/food1.jpg"));
               

                //clearButton = new JButton("Clear orders");
                //clearButton.addActionListener(e -> Operations.Clear("orders"));
                
                //displayButton = new JButton("Display orders");
                //displayButton.addActionListener(e -> displayBox());
                for(int i = 0; i < numAds; i++)
                    {
                        ads[i] = new RestaurantAd("Insert order", "heelo", food1, this.getWidth());
                        ads[i].addActionListener(e -> insertBox());
                        panel.add(ads[i]);
                    }
                this.getContentPane().add(scroller);
                this.setLocationRelativeTo(null);
                this.setVisible(true);
                
                //add(displayButton);
                //add(clearButton);
                //this.updateButtonSizes();

            }
        /*private void updateButtonSizes() 
            {
                int WIDTH = (int) (this.getWidth() * 0.8); 
                int HEIGHT = 200;
                
                displayButton.setPreferredSize(new Dimension(WIDTH, HEIGHT));
                clearButton.setPreferredSize(new Dimension(WIDTH, HEIGHT));
                
                
                revalidate(); 
                repaint();    
            }*/
    }
