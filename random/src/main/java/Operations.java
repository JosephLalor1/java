import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Operations {

    public static void Insert(String obj)
        {
            Connection connection = null;
            PreparedStatement pstat = null;
            int i = 0;
            try 
                {
                    // establish connection to database
                    connection = DriverManager.getConnection(DATABASE_URL, "root", "pleasantBreeze1645");
                    // create Prepared Statement for inserting data into table
                    pstat = connection.prepareStatement("INSERT INTO orders (name) VALUES (?)");
                    pstat.setString (1, obj );
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
    final static String DATABASE_URL = "jdbc:mysql://localhost/deliveryapp";
    

}
