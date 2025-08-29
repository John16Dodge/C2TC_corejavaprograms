package jdbcPractices;

import java.sql.*;  // ✅ Correct import

public class jdbcDemo {
    public static void main(String[] args) {
        // Credentials
        String url = "jdbc:postgresql://localhost:5432/employee";
        String user = "postgres";
        String password = "m16j28t34";

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

            String query = "SELECT * FROM employee";  // ✅ Correct query
            rs = stmt.executeQuery(query);

            System.out.println("📋 Employee Details: ");
            while (rs.next()) {
                int id = rs.getInt("eid");
                String name = rs.getString("ename");
                String city = rs.getString("city");

                System.out.println("ID: " + id + ", Name: " + name + ", City: " + city);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close Resources
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
    }
}
