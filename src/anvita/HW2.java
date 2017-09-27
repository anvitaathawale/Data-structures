package anvita;

import javax.swing.*;
public class HW2 {



   public static void main(String args[])
   {
       //To quit we need a sentinel value -99
       int SentinelValue=-99;
       int year;
       year=Integer.parseInt(JOptionPane.showInputDialog("Provide the year you want to check or Quit with "+SentinelValue));


       //looping through and checking all the conditions for the year to be leap year or not
       for(;year!=SentinelValue;)
       {
           //If the year is a leap year it wont be divisible by 100 ,it will divisible by 400 and and it will be divisible by 4
           if (((year % 100 != 0)) && (year % 4 == 0) || (year % 400 == 0))

           {   
               //notifying its a leap yr
               JOptionPane.showMessageDialog(null, year + "***ITS A LEAP YEAR***");
           } else {

               JOptionPane.showMessageDialog(null, year + "***SORRY ITS NOT A LEAP YEAR***");

           }
           year = Integer.parseInt(JOptionPane.showInputDialog("Provide the year you want to check or Quit with " + SentinelValue));
       }


   }


}

