package Day6;

import java.sql.*;

public class TaskJDBC {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "Thaniga@1411")) {
            // Insert 3 rows into the table
            String insertSQL = "INSERT INTO task.Studentsss (ID, Name, Grade) VALUES (?, ?, ?)";
            try (PreparedStatement stmt = connection.prepareStatement(insertSQL)) {
                stmt.setInt(1, 1);
                stmt.setString(2, "Alice");
                stmt.setString(3, "A");
                stmt.executeUpdate();
             
                stmt.setInt(1, 2);
                stmt.setString(2, "Bob");
                stmt.setString(3, "B");
                stmt.executeUpdate();

                stmt.setInt(1, 3);
                stmt.setString(2, "Charlie");
                stmt.setString(3, "C");
                stmt.executeUpdate();
                
                stmt.setInt(1, 4);
                stmt.setString(2, "Thaniga");
                stmt.setString(3, "D");
                stmt.executeUpdate();
            }

            // Update the grade of one student
            String updateSQL = "UPDATE task.Studentsss SET Grade = ? WHERE ID = ?";
            try (PreparedStatement stmt = connection.prepareStatement(updateSQL)) {
                stmt.setString(1, "O");
                stmt.setInt(2, 4);
                stmt.executeUpdate();
            }

//            // Delete a student by ID
//            String deleteSQL = "DELETE FROM Studentsss WHERE ID = ?";
//            try (PreparedStatement stmt = connection.prepareStatement(deleteSQL)) {
//                stmt.setInt(1, 3);
//                stmt.executeUpdate();
//            }

            // Retrieve and display all students
            String selectSQL = "SELECT * FROM task.Studentsss";
            try (Statement stmt = connection.createStatement();
                 ResultSet rs = stmt.executeQuery(selectSQL)) {
                while (rs.next()) {
                    int id = rs.getInt("ID");
                    String name = rs.getString("Name");
                    String grade = rs.getString("Grade");
                    System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

