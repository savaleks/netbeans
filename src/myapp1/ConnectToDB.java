/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp1;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class ConnectToDB {
  
     /**
     * main method
     *
     * @param args
     * @throws java.sql.SQLException
     */
    
    public static void main(String[] args) throws SQLException {
         //prisijungimas prie duombaze;
         try (Connection conn = MySQLJDBCUtil.getConnection()) {
            
            // print out a message
            System.out.println(String.format("Connected to database %s "
                    + "successfully.", conn.getCatalog()));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }   
}
