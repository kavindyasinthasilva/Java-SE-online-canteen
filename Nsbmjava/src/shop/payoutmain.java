/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Kavindu Yasintha
 */
public class payoutmain  {
    
    
    String name;
    String id;
    String card;
    String cvv;
    
      String  username;
      String userid;
    
    
    public payoutmain( ) throws SQLException, ClassNotFoundException 
    {
        
      
        
        
        
 
        
        
        
    }
    public payoutmain(String name, String id) {
        
        this.name=name;
        this.id=id;
    
    
        
    }
    
    public payoutmain(String name, String id,String username ,String userid)
    {
        this.name=name;
        this.id=id;
        this.username=username;
        this.userid=userid;
        
        
    }
    
    
    public String name()
    {
        
        return name;
        
    }
     public String id()
    {
        
        return id;
        
    }
      public String username()
    {
        
        return username;
        
    }
       public String useridid()
    {
        
        return userid;
        
    }
    
    
    
    
     
     public ArrayList<Cartdb> userList() throws SQLException{
        
        ArrayList<Cartdb> userList = new ArrayList<>();
        
               Connection conn = null;
       java.sql. Statement stmt = null;
       
       
        
         
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","@Root123");
            System.out.println("connected");
            
            java.sql.Statement state =((java.sql.Connection) conn).createStatement();
            
            String q1 ="SELECT * FROM cart ";
            
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(q1);
            
         
            
            while(rs.next())
            {
                Cartdb cartdb = new  Cartdb  (rs.getInt("itemno"),rs.getInt("amount"),rs.getInt("price"),rs.getInt("total"));
                userList .add( cartdb);
            }

           
            
        } catch (ClassNotFoundException ex) {
            
        }

        
        return userList;
        
        
        
    }
     

    
 
    public void showuser() throws SQLException, ClassNotFoundException
    {
        
        
        ArrayList<Cartdb> list = userList(); 
        
        payout sky = new payout();
         
        
        DefaultTableModel model;
        model = ( DefaultTableModel) sky.nsbm.getModel();
        
       
        
        Object [] row  =  new  Object [5];// colems
        
        
         Connection conn = null;
       java.sql. Statement st = null;
        
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","@Root123");
            System.out.println("connected");
            
            java.sql.Statement state =((java.sql.Connection) conn).createStatement();
            
         
        
        for (int i =0 ; i<list.size(); i++)
        {
           row[0] = list.get(i). itemsid();
           row[1] = list.get(i). amount();
           
           payoutmain x =new payoutmain();
           
          
           
        
           
        
 
             try{
                 
                  
            
            String sql = "INSERT INTO oderd(itemid,amount,username,userid)VALUES (?,?,?,?)";
 
             PreparedStatement statement = conn.prepareStatement(sql);
              statement.setString(1, row[0].toString());
              statement.setInt(2, (int) row[1]);
              statement.setString(3, name);
              statement.setString(4, id);
            //  statement.setString(5, sky.setage());
 
         int rowsInserted = statement.executeUpdate();
             if (rowsInserted > 0) {
              System.out.println("A new user was inserted successfully!");
                 
             }
         
 
             }
             catch(SQLException e){
            System.out.println(e.getMessage());
        }
           
        //row[4] = list.get(i).Updatesalary();
            
            model.addRow(row);
        }
        
        
         
        
        
    }

    
    
    
    
    
 
}