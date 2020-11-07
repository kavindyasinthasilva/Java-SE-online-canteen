/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kavindu Yasintha
 */
public class Cartdb {

    
    
    
     int id;
     int price;
     int amount;
     int tptice;
    
    
            
    
   
             
             public Cartdb (int x,int y,int z ,int d)
             {
                 
                 
                 
                 this.id =x;
                 this.amount=y;
                 this.price=z;
                 this.tptice=d;
              
                 
                 
                 
             }
             
             
             
             public  int itemsid()
             {
                 
                  return id;
                 
                 
             }
    
             
              public  int amount()
             {
                 
                  return amount;
                 
                 
             }
              
              
                public  int price()
             {
                 
                  return price;
                 
                 
             }
             
             
                 public  int newprice()
             {
                 
                  return tptice;
                 
                 
             }
                
                 
                 
                 
                 
                
             
       //  SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\kavindu yasintha\Documents\billmangment.mdf;Integrated Security=True;Connect Timeout=30");

     /*   public void rice()
        {
           

       Connection conn = null;
       java.sql. Statement stmt = null;
       
       
       
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","@Root123");
            System.out.println("connected");
            
            java.sql.Statement state =((java.sql.Connection) conn).createStatement();
            
            stmt = conn.createStatement();
            
            
            String sql = "INSERT INTO cart(itemno,amount,price,Toatal) VALUES('" + id + "','" + amount + "', '" + price + "','" + tptice+ "')";

                
            stmt.executeUpdate(sql);
                  
            
         
            
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }




        public void sprice(int count)
        {
            int id = 002;
            int price = 450;

            int amount = count;

            int newprice = amount * price;

           
            
   Connection conn = null;
       java.sql. Statement stmt = null;
            
            
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","@Root123");
            System.out.println("connected");
            
            java.sql.Statement state =((java.sql.Connection) conn).createStatement();
            
            stmt = conn.createStatement();
            
            
            String sql = "INSERT INTO cart(itemno,amount,price,Toatal) VALUES('" + id + "','" + amount + "', '" + price + "','" + newprice+ "')";

                
            stmt.executeUpdate(sql);
                  
            
         
            
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    

            
            
            
            
            
            
            
            


        }

        public void eggrice(int count)
        {
            int id = 003;
            int price = 150;

            int amount = count;

            int newprice = amount * price;

          
            
   Connection conn = null;
       java.sql. Statement stmt = null;
            
            
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","@Root123");
            System.out.println("connected");
            
            java.sql.Statement state =((java.sql.Connection) conn).createStatement();
            
            stmt = conn.createStatement();
            
            
            String sql = "INSERT INTO cart(itemno,amount,price,Toatal) VALUES('" + id + "','" + amount + "', '" + price + "','" + newprice+ "')";

                
            stmt.executeUpdate(sql);
                  
            
         
            
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }

            
            


        
        public void buger(int count)
        {
            int id = 004;
            int price = 80;

            int amount = count;

            int newprice = amount * price;

            
            
            
            
            
                        
   Connection conn = null;
       java.sql. Statement stmt = null;
            
            
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","@Root123");
            System.out.println("connected");
            
            java.sql.Statement state =((java.sql.Connection) conn).createStatement();
            
            stmt = conn.createStatement();
            
            
            String sql = "INSERT INTO cart(itemno,amount,price,Toatal) VALUES('" + id + "','" + amount + "', '" + price + "','" + newprice+ "')";

                
            stmt.executeUpdate(sql);
                  
            
         
            
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
            
            


        }

        public void orange(int count)
        {
            int id = 005;
            int price = 150;

            int amount = count;

            int newprice = amount * price;

           
            
                        
   Connection conn = null;
       java.sql. Statement stmt = null;
            
            
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","@Root123");
            System.out.println("connected");
            
            java.sql.Statement state =((java.sql.Connection) conn).createStatement();
            
            stmt = conn.createStatement();
            
            
            String sql = "INSERT INTO cart(itemno,amount,price,Toatal) VALUES('" + id + "','" + amount + "', '" + price + "','" + newprice+ "')";

                
            stmt.executeUpdate(sql);
                  
            
         
            
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
            
            
            
            
            
            
            
            
            
            


        }

        public void snack(int count)
        {

            int id = 006;
            int price = 40;

            int amount = count;

            int newprice = amount * price;

         
            
            
                        
   Connection conn = null;
       java.sql. Statement stmt = null;
            
            
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","@Root123");
            System.out.println("connected");
            
            java.sql.Statement state =((java.sql.Connection) conn).createStatement();
            
            stmt = conn.createStatement();
            
            
            String sql = "INSERT INTO cart(itemno,amount,price,Toatal) VALUES('" + id + "','" + amount + "', '" + price + "','" + newprice+ "')";

                
            stmt.executeUpdate(sql);
                  
            
         
            
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }


        }

        public void riceandcarry(int count)
        {


            int id = 007;
            int price = 140;

            int amount = count;

            int newprice = amount * price;

           
            
                        
   Connection conn = null;
       java.sql. Statement stmt = null;
            
            
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","@Root123");
            System.out.println("connected");
            
            java.sql.Statement state =((java.sql.Connection) conn).createStatement();
            
            stmt = conn.createStatement();
            
            
            String sql = "INSERT INTO cart(itemno,amount,price,Toatal) VALUES('" + id + "','" + amount + "', '" + price + "','" + newprice+ "')";

                
            stmt.executeUpdate(sql);
                  
            
         
            
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }


        }
        


        public void iddiappa(int count)
        {
            int id;
            id = 0010;
            
            int price = 40;

            int amount = count;

            int newprice = amount * price;

            
            
            
            
            
                        
   Connection conn = null;
       java.sql. Statement stmt = null;
            
            
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","@Root123");
            System.out.println("connected");
            
            java.sql.Statement state =((java.sql.Connection) conn).createStatement();
            
            stmt = conn.createStatement();
            
            
            String sql = "INSERT INTO cart(itemno,amount,price,Toatal) VALUES('" + id + "','" + amount + "', '" + price + "','" + newprice+ "')";

                
            stmt.executeUpdate(sql);
                  
            
         
            
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
            
            
            
            

        }

        public void kiribath(int count)
        {
            int id = 0022;
            int price = 40;

            int amount = count;

            int newprice = amount * price;

          
            
            
                        
   Connection conn = null;
       java.sql. Statement stmt = null;
            
            
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","@Root123");
            System.out.println("connected");
            
            java.sql.Statement state =((java.sql.Connection) conn).createStatement();
            
            stmt = conn.createStatement();
            
            
            String sql = "INSERT INTO cart(itemno,amount,price,Toatal) VALUES('" + id + "','" + amount + "', '" + price + "','" + newprice+ "')";

                
            stmt.executeUpdate(sql);
                  
            
         
            
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
            
            
            
            
            
            
            


        }

        
     */
            
            
            
            
        }
           
           
        


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

