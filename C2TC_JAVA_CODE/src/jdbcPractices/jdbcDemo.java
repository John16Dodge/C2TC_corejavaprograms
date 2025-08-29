package jdbcPractices;

import java.sql.*;

public class jdbcDemo {
    public static void main(String[] args) {
        // Credentials
        String url = "jdbc:postgresql://localhost:5432/employee";
        String user = "postgres";
        String password= "m16j28t34";

        // JDBC Variables
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load PostgreSQL driver
            Class.forName("org.postgresql.Driver");

            // Connect to database
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to PostgreSQL database!");

            // Example: create statement
            stmt = conn.createStatement();
            
            String query= "SELECT * FROM employee";
            
            rs = stmt.executeQuery("SELECT version();");

           System.out.println("Emp Deatis: ");
           while (rs.next()) {
        	   int id =rs.getInt("eid");
        	   String Name= rs.getString("ename");
        	   String Name= rs.getString("city");
           }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	//Close Resources
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
    }
}
