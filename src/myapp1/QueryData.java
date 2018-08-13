/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class QueryData {
     public static void main(String[] args) { 
        // 
        String sql = "SELECT first_name, last_name, email " +
                     "FROM candidates";
        
        try (Connection conn = MySQLJDBCUtil.getConnection();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)) {
           
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("first_name") + "\t" + 
                                   rs.getString("last_name")  + "\t" +
                                   rs.getString("email"));
                    
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    }
