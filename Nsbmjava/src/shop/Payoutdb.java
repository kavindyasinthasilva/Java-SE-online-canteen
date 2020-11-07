/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kavindu Yasintha
 */
public class Payoutdb extends payoutmain{
    
    String name;
    String id;
    String card;
    String cvv;
    String type;
    String pay;
    
    
    
    public Payoutdb(String x, String y, String z, String p,String t,String pay) throws SQLException, ClassNotFoundException {
        super();
        
        
        
        
        this.name=x;
        this.id=y;
        this.card=z;
        this.cvv=p;
        this.type=t;
        this.pay=pay;
        
        
        
       
        
        
        
        
    }
    
    public String name()
    {
        
        return name;
        
        
    }
    
    public String id()
    {
        
        return id;
        
        
    }
    
    public String card()
    {
        
        return card;
        
        
    }
    
    public String cvv()
    {
        
        return cvv;
        
        
    }
    
    public String type()
    {
        
        return type;
        
        
    }
    public String pay()
    {
        
        return pay;
        
    }
    
    
    public void db() throws ClassNotFoundException, SQLException
    {
        
        
         
         Connection conn = null;
       java.sql. Statement st = null;
        
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","@Root123");
            System.out.println("connected");
            
            java.sql.Statement state =((java.sql.Connection) conn).createStatement();
            
        
             try{
                 
                  
            
            String sql = "INSERT INTO payment(userid,username,card,ccv,type,price)VALUES (?,?,?,?,?,?)";
 
             PreparedStatement statement = conn.prepareStatement(sql);
              statement.setString(1,name() );
              statement.setString(2, id()); 
              statement.setString(3, card());
               statement.setString(4, cvv());
               statement.setString(5, type());
                statement.setString(6, pay());
            //  statement.setString(5, sky.setage());
 
         int rowsInserted = statement.executeUpdate();
             if (rowsInserted > 0) {
              System.out.println("A new user was inserted successfully!");
                 
             }
         
 
             }
             catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
    }

    
    
    
    
    
}
