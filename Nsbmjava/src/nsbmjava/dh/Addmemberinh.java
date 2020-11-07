/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmjava.dh;





/**
 *
 * @author Kavindu Yasintha
 */
public class Addmemberinh {
    
    
    
    String name;
    String Id;
    String Phone;

    String dob;
    String add;
    
    
    
    public Addmemberinh (String name, String a,String id ,String p ,String dob)
    {
        this.name=name;
        this.Id=id;
         this.add=a;
        this.Phone=p;
        
        this.dob=dob;
       
        
        
    }
    
    
     public String  setname()
        {

            return name;


        }

        public String setage()
        {

            return dob;



        }

        public String setadd()
        {

            return add ;

        }

        public String setid()
        {

            return Id;
        }

     
        
        
        public String phone()
        {
            return  Phone;
            
            
        }
        
        
    
    
    
    
    
}
