package Jdbc;
import java.sql.*;

public class Jdbc1 {
    	public int getResults(Jdbc2 j2) {
    		int rowsAffected = 0;
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "8008");
         // Prepare an SQL statement with placeholders
            String query = "INSERT INTO database1.emp1 (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            // Set values for placeholders
            pstmt.setInt(1, j2.getId());
            pstmt.setString(2, j2.getName());
            pstmt.setInt(3, j2.getAge());
            
            // Execute the query
            rowsAffected = pstmt.executeUpdate();
            System.out.println("Rows inserted: " + rowsAffected);
            
            // Close resources
            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
		return rowsAffected;
        
    	}
}