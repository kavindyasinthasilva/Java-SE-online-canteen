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
public class Inhsalary {
    
    
    
    
    
    
    
       public int NiC;
       public int Bsalary;
       public int houres;
       public int ye;

        public Inhsalary(int x, int y, int z, int j) 
        {

            this.NiC = x;
            this.Bsalary = y;
            this.houres = z;
            this.ye = j;


        }

   


        public int setnic()
        {
             return NiC;


        }

        public  int setBsalary()
        {


            return Bsalary;
        }

        public  int sethoures()
        {

            return houres;

        }

        public  int setyear()
        {


            return ye;


        }

        public int Updatesalary()
        {

            int newsalary;

            if(ye >= 5)
            {

                newsalary = Bsalary * 5000;

                return newsalary;

            }
            else
            {

                newsalary = Bsalary;

                return newsalary;


            }





        }



       

    
    
    
    
    
    
    
    
}
