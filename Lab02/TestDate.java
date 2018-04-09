/*
   Purpose:
     This class tests the Date class.

   Record of revisions:
       Date       Programmer          Description of change
       ====       ==========          =====================
      4/16/98    S. J. Chapman        Original code
*/
public class TestDate {

   // Define the main method to test class Date
   public static void main(String[] args) {

      // Declare variables, and define each variable
      Date d1 = new Date(1,1,1900);   // Date 1
      Date d2 = new Date(1,2,1901);   // Date 2
      Date d3 = new Date();           // Date 3
      Date d4 = new Date();           // Date 4

      // Set d3
      d3.setDate(3,1,1996);

      // Print out dates
      System.out.println ("Date 1 = " + d1);
      System.out.println ("Date 2 = " + d2);
      System.out.println ("Date 3 = " + d3);
      System.out.println ("Date 4 = " + d4);

      // Check isLeapYear
      if ( d1.isLeapYear() )
         System.out.println (d1.getYear() + " is a leap year.");
      else
         System.out.println (d1.getYear() + " is not a leap year.");

      if ( d2.isLeapYear() )
         System.out.println (d2.getYear() + " is a leap year.");
      else
         System.out.println (d2.getYear() + " is not a leap year.");

      // Check isEqual
      if ( d1.isEqual(d3) )
         System.out.println (d3 + " is equal to " + d1);
      else
         System.out.println (d3 + " is not equal to " + d1);

      // Check isEarlier
      if ( d1.isEarlier(d3) )
         System.out.println (d1 + " is earlier than " + d3);
      else
         System.out.println (d1 + " is not earlier than " + d3);

      // Check isLater
      if ( d1.isLater(d3) )
         System.out.println (d1 + " is later than " + d3);
      else
         System.out.println (d1 + " is not later than " + d3);
      
      // Print number day of year
      System.out.println (d1.toString() + " is day number " 
    		  + d1.dayOfYear(d1.getMonth(), d1.getDay(), d1.isLeapYear()) + " of the year.");
      
      System.out.println (d2.toString() + " is day number " 
    		  + d1.dayOfYear(d2.getMonth(), d2.getDay(), d2.isLeapYear()) + " of the year.");
      
      System.out.println (d3.toString() + " is day number " 
    		  + d1.dayOfYear(d3.getMonth(), d3.getDay(), d3.isLeapYear()) + " of the year.");
      
      System.out.println (d4.toString() +  " is day number " 
    		  + d1.dayOfYear(d4.getMonth(), d4.getDay(), d4.isLeapYear()) + " of the year.");
      
      // Print out number of days since 1 January 1900
      System.out.println(d1.toString() + " is " + d1.differenceOfDays(d1.getMonth(), d1.getDay(), d1.getYear(), d1.isLeapYear())( 
    		  + " days from 1/1/1900.");
      
      System.out.println(d2.toString() + " is " + d2.differenceOfDays(d2.getMonth(), d2.getDay(), d2.getYear(), d2.isLeapYear()) 
    		  + " days from 1/1/1900.");
      
      System.out.println(d3.toString() + " is " + d3.differenceOfDays(d3.getMonth(), d3.getDay(), d3.getYear(), d3.isLeapYear()) 
    		  + " days from 1/1/1900.");
      
      System.out.println(d4.toString() + " is " + d4.differenceOfDays(d4.getMonth(), d4.getDay(), d4.getYear(), d4.isLeapYear()) 
    		  + " days from 1/1/1900.");
      
      // Print out number of days from one date to another
      System.out.println(d1.toString() + " is " + d1.differenceOfDays(d1.getMonth(), d1.getDay(), d1.getYear(), d2.getMonth(), d2.getDay(),
    		  d2.getYear(), d1.isLeapYear(), d2.isLeapYear()) 
    		  + " days from " + d2.toString());
      
     
      

   }
}
