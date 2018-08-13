/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class DeleteData {
     public static void main(String[] args) throws SQLException {
         //prisijungimas prie duombaze;
         try (Connection conn = MySQLJDBCUtil.getConnection()) {
             System.out.println(String.format("Connected to database %s "
                    + "successfully.", conn.getCatalog()));
             
             PreparedStatement abc = conn.prepareStatement("delete from candidates where id = 100");
             int i = abc.executeUpdate();
             System.out.println("" + i + " deleted successfully");
            // print out a message
         
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }   
}
