import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class MainFrame extends JFrame
    {
        //private JButton clearButton, displayButton;
        private JPanel panel = new JPanel();
        private int numAds = 10;
        private RestaurantAd[] ads = new RestaurantAd[numAds];
        public static void insertBox()
            {
                String order = JOptionPane.showInputDialog("Enter new order for table: ");
                Operations.Insert("orders", order);
            }
        public void displayBox()
            {
                JOptionPane.showMessageDialog(MainFrame.this, Operations.Display("orders"));
            }
        public MainFrame()
            {
                super("Delivery App");

                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setExtendedState(JFrame.MAXIMIZED_BOTH);
                this.setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();
                panel.setLayout(new GridLayout(numAds, 1));
                
                JScrollPane scroller = new JScrollPane(panel);
                scroller.getVerticalScrollBar().setUnitIncrement(16);
                ImageIcon foodLoad = new ImageIcon(MainFrame.class.getResource("/images/icons/food1.jpg"));
                Image foodScale = foodLoad.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
                ImageIcon food = new ImageIcon(foodScale);
                
                MenuBar menuBar = new MenuBar();
                gbc.gridx = 0;
                gbc.gridy = 0;
                this.getContentPane().add(menuBar, gbc);
                gbc.gridx = 0;
                gbc.gridy = 4;
                gbc.gridheight = 4;
                gbc.fill = GridBagConstraints.VERTICAL;
                this.getContentPane().add(scroller, gbc);
                this.setLocationRelativeTo(null);
                this.setVisible(true);
                //clearButton = new JButton("Clear orders");
                //clearButton.addActionListener(e -> Operations.Clear("orders"));
                
                //displayButton = new JButton("Display orders");
                //displayButton.addActionListener(e -> displayBox());
                for(int i = 0; i < numAds; i++)
                    {
                        ads[i] = new RestaurantAd("Insert order", "heelo", food);
                        ads[i].addActionListener(e -> insertBox());
                        panel.add(ads[i]);
                    }
                //panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
                //panel.revalidate();
                //panel.repaint();
                
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
