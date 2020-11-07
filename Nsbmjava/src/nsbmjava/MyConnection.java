/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmjava;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Kavindu Yasintha
 */
public class MyConnection {
    

    // create a function to connect with mysql database
    
    public static Connection getConnection(){
     
        Connection conn = null;
        java.sql. Statement stmt = null;
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","@Root123");
            
             java.sql.Statement state =((java.sql.Connection) conn).createStatement();
            
            stmt = conn.createStatement();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return conn;
    }
    
}  

