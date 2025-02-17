package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class Jdbc1 {
    	public int getResults(Jdbc2 j1) {
    		int rowsAffected = 0;
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "Thaniga@1411");
         // Prepare an SQL statement with placeholders
            String query = "INSERT INTO projectdb.emp1 (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            // Set values for placeholders
            pstmt.setInt(1, j1.getId());
            pstmt.setString(2, j1.getName());
            pstmt.setInt(3, j1.getAge());
            
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

