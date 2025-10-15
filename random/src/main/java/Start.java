


import javax.swing.JOptionPane;

public class Start {
    public static void main(String[] args) 
        {

            String order = JOptionPane.showInputDialog("Enter new order for table: ");
            Operations.Insert(order);

        }
}
