import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Operations {

    static Connection connection = null;
    public static void Connect()
        {
            try 
                {
                    // establish connection to database
                    connection = DriverManager.getConnection(DATABASE_URL, "root", "pleasantBreeze1645");
                }
            catch(SQLException sqlException)
                {
                    sqlException.printStackTrace();
                }
        }
    public static void Clear(String table)
        {
            PreparedStatement pstat = null;
            try 
                {
                    pstat = connection.prepareStatement("DELETE FROM " + table);
                    pstat.execute();
                    System.out.println("Cleared table");
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
                        }
                    catch (Exception exception)
                        {
                            exception.printStackTrace();
                        }
                }
        }
    public static void Display(String table)
        {
            PreparedStatement pstat = null;
            ResultSet resultSet = null;
            try 
                {

                    // create Prepared Statement for inserting data into table
                    pstat = connection.prepareStatement("SELECT * FROM " + table);
                    resultSet = pstat.executeQuery();
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    // insert data into table
                    int numberOfColumns = metaData.getColumnCount();
                    System.out.println("Orders Database:\n");

                    for ( int i = 1; i <= numberOfColumns; i++ )
                        {
                            System.out. print (metaData.getColumnName( i ) + "\t");
                            System.out. println () ;
                        }

                    while( resultSet .next() )
                        {
                            for ( int i = 1; i <= numberOfColumns; i++ )
                                {
                                    System.out. print ( resultSet .getObject( i ) + "\t\t");
                                    System.out. println () ;
                                }
                        }
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
                        }
                    catch (Exception exception)
                        {
                            exception.printStackTrace();
                        }
                }
        }
    public static void Insert(String table, String obj)
        {

            PreparedStatement pstat = null;
            int i = 0;
            try 
                {
                    // create Prepared Statement for inserting data into table
                    pstat = connection.prepareStatement("INSERT INTO " + table + " (name) VALUES (?)");
                    pstat.setString (1, obj );
                    // insert data into table
                    i = pstat .executeUpdate();
                    System.out.println(i + " record successfully added to the table .");
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
                        }
                    catch (Exception exception)
                        {
                            exception.printStackTrace();
                        }
                }
        }
    final static String DATABASE_URL = "jdbc:mysql://localhost/deliveryapp";
    public static void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception exception)
                {
                    exception.printStackTrace();
                }
        }
    }
}
