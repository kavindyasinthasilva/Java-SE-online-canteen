/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmjava;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author Kavindu Yasintha
 */
public class loginencp {
    
    String username;
    String Password;
    
    public loginencp()
    {
        
        
        
    }
    
    
    public void userget(String u)
    {
        
        this.username=u;
        
    }
     public void passget(String p)
    {
        this.Password=p;
        
        
    }
     
     public String userset()
     {
         
          return username;
         
     }
   
      public String Passset()
     {
         
          return Password;
         
     }
    
     public void logindb()
     {
         
         
         
         
         
          String query = "SELECT * FROM `log` WHERE `username` =? AND `password` =?";
     
          PreparedStatement ps;
          ResultSet rs;
    
     
    
    
        
 try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1,userset() );
            ps.setString(2, Passset());
            
            rs = (ResultSet ) ps.executeQuery();
            
            if(rs.next())
            {
                    home mf = new home();
                    mf.setVisible(true);
                    mf.pack();
                    mf.setLocationRelativeTo(null);
                   // mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                 //   mf.jLabel1.setText("Welcome < "+uname+" >");
                 JOptionPane.showMessageDialog(null, "Welcome ");
                 
                      // this.dispose();
                   
            }
            else{
                    JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
                }
            
        } catch (SQLException ex) {
           
        }
         
         
         
         
     }
      
      
    
    
}
