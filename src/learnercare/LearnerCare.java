
package learnercare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author medoo
 */
public class LearnerCare {


    
    
    public static void main(String[] args) {
        try{
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
            // line below needs to be modified to include the database name, user, and password (if any)
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=LearnerCare;user=medoo;password=medoo;");
 
     System.out.println("Connected to database !");
 
   }
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }
        new studentregistration().setVisible(true);
        
    }
    
}
