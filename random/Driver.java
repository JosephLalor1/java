import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Driver {
    public static void main( String [] args )
        {
            final String DATABASE_URL = "jdbc:mysql://localhost/deliveryapp";
            Connection connection = null;
            PreparedStatement pstat = null;
            String order = JOptionPane.showInputDialog("Enter new order for table: ");
            int i = 0;
        try 
            {
                // establish connection to database
                connection = DriverManager.getConnection(DATABASE_URL, "root", "pleasantBreeze1645");
                // create Prepared Statement for inserting data into table
                pstat = connection.prepareStatement("INSERT INTO orders (name) VALUES (?)");
                pstat.setString (1, order );
                // insert data into table
                i = pstat .executeUpdate();
                System.out. println (i + " record successfully added to the table .");
            }
        catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
            }
        finally 
            {
                try 
                    {
                        pstat.close();
                        connection.close();
                    }
                catch (Exception exception)
                    {
                        exception.printStackTrace();
                    }
            }
        }
}
