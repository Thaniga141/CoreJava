package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class Jdbc1 {
	  public static void main(String[] args) {
	        // Step 1: Load the JDBC driver (optional for newer versions of Java)
	        try {
	            // For MySQL
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            
	            // Step 2: Establish the connection
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb1", "root", "Thaniga@1411");
	            
	            // Step 3: Create a statement object
	            Statement stmt = conn.createStatement();
	            
	            // Step 4: Execute a query
//	            String query = "UPDATE emp2 SET name = 'siva' where id = 13";
//	            int rs = stmt.executeUpdate(query);
	            String query = "DELETE from emp2 where id = 13";
	            int rs = stmt.executeUpdate(query);
	            
	            // Step 5: Process the result
//	            while (rs.next()) {
//	                int id = rs.getInt("id");
//	                String name = rs.getString("name");
//	                int age = rs.getInt("age");
//	                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
//	            }
	            if(rs >= 1) {
	            	System.out.println("Updated Successfully");
	            }else {
	            	System.out.println("not updated");
	            }
//	            
	            // Step 6: Close resources
//	            rs.close();
	            stmt.close();
	            conn.close();
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }
}