/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import nsbmjava.dh.Addmemberinh;

/**
 *
 * @author Kavindu Yasintha
 */
public class inhragis {
    
    String username;
    String email;
    String pass;
    String type;
    String id;
    
   public  inhragis(String x ,String y, String z, String p,String d)
   {
       
       this.username = x;
       this.email =y;
       this.pass =z;
       this.type =p;
       this.id=d;
       
       
       
       
       
       
       
       
       
   }
   
   public String name()
   {
       
       return username;
   }
    
    
    public String email()
   {
       
       return email;
   }
    
    public String pass()
   {
       
       return pass;
   }
    
    public String type()
   {
       
       return  type;
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
            
            
            String sql = "INSERT INTO coustomer(username, email, password, type,id) VALUES (?, ?, ?, ?,?)";
 
             PreparedStatement statement = conn.prepareStatement(sql);
              statement.setString(1,  name());
              statement.setString(2, email());
              statement.setString(3, pass());
              statement.setString(4, type());
              statement.setString(5, id());
 
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
