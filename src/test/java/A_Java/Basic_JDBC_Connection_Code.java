package A_Java;

public class Basic_JDBC_Connection_Code 
{
public static void main(String[] args) 
{
	try 
    {
        // Database details
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "root";

        // Create connection
        //Connection con = DriverManager.getConnection(url, username, password);

       // if (con != null) 
        {
            System.out.println("Database connected successfully");
        }

        // Close connection
        //con.close();
    } 
    catch (Exception e) 
    {
        e.printStackTrace();
    }	
}
}
