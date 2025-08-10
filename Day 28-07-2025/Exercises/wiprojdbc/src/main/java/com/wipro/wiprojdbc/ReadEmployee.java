package com.wipro.wiprojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadEmployee {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/wiprojdbc"; 
        String user = "root";     
        String password = "root"; 
        try {
            Connection conn = DriverManager.getConnection(url,user, password);
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("emp_name");
                String dept = rs.getString("department");

                System.out.println(id + " | " + name + " | " + dept);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
