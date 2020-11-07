/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmjava.dh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Kavindu Yasintha
 */
public class Addmindb {
    
    String name;
   String email;
           
    String password;
    String id;
    
    
    public  Addmindb(String x,String y,String z,String id)
            
    {
        
        this.name=x;
        this.email=y;
        this.password=z;
        this.id=id;
        
        
        
    }
    
    
    public String name()
    {
        
        return name;
        
    }
     public String email()
    {
        
        return email;
        
    }
    
      public String pass()
    {
        
        return password;
        
    }
      
          public String id()
    {
        
        return id;
        
    }
          
      public void db()
       {
              
              
              
                 
        Connection conn = null;
        java.sql. Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","@Root123");
            System.out.println("connected");

            java.sql.Statement state =((java.sql.Connection) conn).createStatement();

            //stmt = conn.createStatement();

            String sql = "INSERT INTO log(username, email, password, id) VALUES (?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,  name());
            statement.setString(2,  email() );
            statement.setString(3,  pass());
            statement.setString(4,  id());
            

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }

        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }

              
              
              
              
              
          }
    
    
    
    
    
    
}
