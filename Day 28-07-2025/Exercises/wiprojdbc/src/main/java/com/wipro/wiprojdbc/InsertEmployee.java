package com.wipro.wiprojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployee {

    public static void main(String[] args) {
    	String url = "jdbc:mysql://localhost:3306/wiprojdbc";
        String id = "root";
        String password = "root";

        try {
            // Connect to the database
            Connection conn = DriverManager.getConnection(url, id, password);

            // SQL insert query
            String query = "INSERT INTO employee (emp_name, department) VALUES (?, ?)";

            // Prepare statement
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "rushikesh tambe");
            stmt.setString(2, "Comp");
            

            // Execute insert
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Employee inserted!");
            }

            // Close connection
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error inserting employee:");
            e.printStackTrace();
        }
    }
}
