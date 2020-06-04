// Save the files: hawa.java , Reservation1.java, Person1.java & Set.java all in one folder

import java.util.*;
import java.io.*;
import makeReservation.Reservation1;
//import makeReservation1.Reservation2;
import PersonPackage.Person1;
import SetPackage.Set;
import SetPackage1.set2;//IMPORTING ALL PACKAGES
  
public class hawa
{
  public static void main(String[] args)
  {
      Set s = new Set();//CREATING AN OBJECT FOR CLASS SET
     
      Reservation1 r=new Reservation1();//OBJECT CREATION FOR CLASS RESERVATION
	set2 s0=new set2();//CREATING AN OBJECT FOR CLASS set2

      char[][] c1=s.set_b_Array();// displaying seat matrix according to the flight
      char[][] c2=s.set_a_Array();
      char[][] c3=s0.set_c_Array();
      char[][] c4=s0.set_d_Array();
      char[][] c5=s.set_e_Array();
      char[][] c6=s.set_f_Array();
      char[][] c7=s0.set_g_Array();
      char[][] c8=s0.set_h_Array();
            

      
      int economy_ticket=100;//ticket price
      int firstclass_ticket=200;


    while(true)//user details
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name");
      String s1=sc.next();
      System.out.println("Enter your gender (mr/mrs)");
      String s2=sc.next();
      System.out.println("Enter your location");
      String s5=sc.next();
      System.out.println("Enter your destination");
      String s3=sc.next();
      System.out.println("What time do you want to catch the flight");
      String s4=sc.next();
     
      Person1 us = new Person1();
      us.Person(s1,s2,s3,s4);
      System.out.println("Please type 1 for First Class or 2 for Economy: ");
      int section = sc.nextInt();
        
     
        
        String t = "BOM";
        String u = "DEL";
     
        if (s5.equals(t) && s3.equals(u)) 
        {
            if (section == 1)
                {
                    r.chose_seat(c1,firstclass_ticket);
                }
            else
            {
                r.chose_seat(c2,economy_ticket);
            }

            
            
            
            if (s5.equals(u) && s3.equals(t)) 
            if (section == 1)
            {
                r.chose_seat(c6,firstclass_ticket);
            }
            else
            {
                r.chose_seat(c7,economy_ticket);
            }
        }
        
        
        
          String v = "BOM";
          String w = "CHE";
     
        if (s5.equals(v) && s3.equals(w)) 
        {
            if (section == 1)
                {
                    r.chose_seat(c4,firstclass_ticket);
                }
            else
            {
                r.chose_seat(c3,economy_ticket);
            }

            if (s5.equals(w) && s3.equals(v)) 
            if (section == 1)
            {
                r.chose_seat(c8,firstclass_ticket);
            }
            else
            {
                r.chose_seat(c7,economy_ticket);
            }
        }
      
        
        
        
      System.out.println("Another entry? (y/n)");
      char c = sc.next().charAt(0);
      if(c=='y')
      {
        continue;
      }
      else
      {
          break;
      }
    }


System.out.println("YOUR FLIGHT DETAILS ARE CONFIRMED.THANKS FOR BOOKING!!");
}
}
