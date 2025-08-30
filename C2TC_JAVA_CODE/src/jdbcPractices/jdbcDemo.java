package jdbcPractices;

import java.sql.*;

public class jdbcDemo {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:postgresql://localhost:6543/employee"; // DB name = employee
        String user = "postgres"; // PostgreSQL username
        String password = "m16j28t34"; // PostgreSQL password

        // JDBC variables
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Establish Connection
            conn = DriverManager.getConnection(url, user, password);

            // Create Statement
            stmt = conn.createStatement(); /*
									         Types : 
									         1.Statement
									         2.Prepared Statement
									         3.Callable Statement
									        */

            // Execute Query
            String query = "SELECT * FROM emp";
            rs = stmt.executeQuery(query); //Used for executing Select based commands used
            								//stmt.executeUpdate Used fpr Non Select based commands

            // Process the result set
            
            System.out.println("Employee Details:");
            System.out.println("-------------------------------------------");
            
            while (rs.next()) {
            		
                int eid = rs.getInt("eid");
                String ename = rs.getString("ename");
                String city = rs.getString("city");

                System.out.println("ID: " + eid + ", Name: " + ename + ", City: " + city);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
