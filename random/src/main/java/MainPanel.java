import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;


public class MainPanel extends JPanel
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
                JOptionPane.showMessageDialog (MainPanel.this, Operations.Display("orders"));
            }
        public MainPanel()
            {
                
                panel.setLayout(new GridLayout(numAds, 1));
                
                JScrollPane scroller = new JScrollPane(panel);
                scroller.getVerticalScrollBar().setUnitIncrement(16);
                ImageIcon foodLoad = new ImageIcon (MainPanel.class.getResource("/images/icons/food1.jpg"));
                Image foodScale = foodLoad.getImage().getScaledInstance(400, 200, Image.SCALE_DEFAULT);
                ImageIcon food = new ImageIcon(foodScale);
                
                this.setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();

                MenuBar menuBar = new MenuBar();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.weightx = 1;
                gbc.gridwidth = 4;
                gbc.gridheight = 1;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                this.add(menuBar, gbc);
                gbc.gridx = 0;
                gbc.gridy = 1;
                gbc.weighty = 1;
                gbc.gridheight = 3;
                gbc.fill = GridBagConstraints.BOTH;
                this.add(scroller, gbc);
                this.setVisible(true);
                //clearButton = new JButton("Clear orders");
                //clearButton.addActionListener(e -> Operations.Clear("orders"));
                
                //displayButton = new JButton("Display orders");
                //displayButton.addActionListener(e -> displayBox());
                for(int i = 0; i < numAds; i++)
                    {
                        ads[i] = new RestaurantAd("Insert order", "hello", food);
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
    }
