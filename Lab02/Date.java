/*
   Purpose:
     This class stores and manipulates dates on the
     Gregorian calendar.  It implements constructors,
     set methods, get methods, and predicate methods,
     and overrides the toString method.

     Method list:
        Date()                   Date constructor
        Date(day,month,year)     Date constructor
        setDate(day,month,year)  Set Date
        getDay()                 Get day
        getMonth()               Get month
        getYear()                Get year
        isLeapYear()             Test for leap year
        isEqual()                Test for equality
        isEarlier()              Is chronologically earler
        isLater()                Is chronologically later
        toString()               Convert to string for display

   Record of revisions:
       Date       Programmer          Description of change
       ====       ==========          =====================
      4/16/98    S. J. Chapman        Original code
      11/3/2000  R. McCauley	      Modified documentation to satisfy local standards
*/
public class Date {

   // Define instance variables
   private int year;       // Year (0 - xxxx)
   private int month;      // Month (1 - 12)
   private int day;        // Day (1 - 31)

   // ***************************************************************************************
 
   public Date() {

   // Default constructor
   // Precondition: None
   // Postcondition: year == 1900 && month == 1 && day == 1

      year = 1900;
      month = 1;
      day = 1;
   }

   // ***************************************************************************************

   public Date(int day, int month, int year) {

   // Constructor for specified date
   // Precondition:	1 <= day <= 31  && 1 <= month <= 12 && 0 <= year <= 9999 
   // Postcondition: 	this.day == day && this.month ==  month && this.year == year
   
      setDate( month, day, year );
   }

   // ***************************************************************************************

   public void setDate(int day, int month, int year) {

   // Method to set a date
   // Precondition:	1 <= day <= 31  && 1 <= month <= 12 && 0 <= year <= 9999 
   // Postcondition: 	this.day == day && this.month ==  month && this.year == year
    
      this.year  = year;
      this.month = month;
      this.day   = day;
   }

   // ***************************************************************************************

   public int getDay() {

   // Method to get day
   // Precondition: None
   // Postcondition: Method value == day

      return day;
   }

  // ***************************************************************************************

   public int getMonth() {

   // Method to get month
   // Precondition: None
   // Postcondition: Method value == month

      return month;
   }
 
   // ***************************************************************************************

   public int getYear() {

   // Method to get year
   // Precondition: None
   // Postcondition: Method value == year

      return year;
   }

  // ***************************************************************************************


   public boolean isLeapYear() {

   // Method to check for leap year
   // Precondition: None
   // Postcondition: Method value == true if year is a leap year, false otherwise

      boolean leap_year;     // flag indicating whether or not year is a leap year

      if ( year % 400 == 0 )
         leap_year = true;
      else if ( year % 100 == 0 )
         leap_year = false;
      else if ( year % 4 == 0 )
         leap_year = true;
      else
         leap_year = false;
      return leap_year;
   }

   // ***************************************************************************************

   public boolean isEqual( Date d ) {

   // Method to check for equality
   // Precondition: None
   // Postcondition: Method value == true if this date is the same as d, false otherwise

      boolean equal;       // flag indicating whether or not dates are the same

      if ( year == d.year && month == d.month &&
           day == d.day )
         equal = true;
      else
         equal = false;
      return equal;
   }

   // ***************************************************************************************
 
   public boolean isEarlier( Date d ) {

   // Method to check if the date stored in this 
   // object is earlier than the Date d.
   // Precondition: None
   // Postcondition: Method value == true if this date is earlier than d, false otherwise


      boolean earlier;        // flag indicating whether or not this date is earlier than d

      // Compare years
      if ( year > d.year )
         earlier = false;
      else if ( year < d.year )
         earlier = true;
      else {

         // Years are equal.  Compare months
         if ( month > d.month )
            earlier = false;
         else if ( month < d.month )
            earlier = true;
         else {

            // Months are equal.  Compare days.
            if ( day >= d.day )
               earlier = false;
            else
               earlier = true;
         }
      }
      return earlier;
   }

   // ***************************************************************************************

   public boolean isLater( Date d ) {

   // Method to check if the date stored in this 
   // object is later than the Date d.
   // Precondition: None
   // Postcondition: Method value == true if this date is later than d, false otherwise

      boolean later;		// flag indicating if this data is later than d

      // Compare years
      if ( year > d.year )
         later = true;
      else if ( year < d.year )
         later = false;
      else {

         // Years are equal.  Compare months
         if ( month > d.month )
            later = true;
         else if ( month < d.month )
            later = false;
         else {

            // Months are equal.  Compare days.
            if ( day > d.day )
               later = true;
            else
               later = false;
         }
      }
      return later;
   }

   // ***************************************************************************************

   public String toString() {

   // Method to convert a date to a string.
   // Precondition: None
   // Postcondition: The date has been returned in the form "MM/DD/YYYY"

      return (month + "/" + day + "/" + year);
   }

  // *****************************************************************************************
  
   public int dayOfYear(int month, int day, boolean leap_year) {
   
   // Method to check number day of specified year
   // Precondition:  Specific Date
   // Postcondition:  The number day of the year
   
   	  int numDays;
   	  
   	  switch (month) {
   	  	case 1:
   	  		numDays = day;
   	  		return numDays;
  		case 2:
  			numDays = day + 31;
  			return numDays;
		case 3:
			if (leap_year == true) {
				numDays = day + 31 + 29;
				return numDays;
			} else {
				numDays = day + 31 + 28;
				return numDays;
			}
			
		case 4:
			if (leap_year == true) {
				numDays = day + 31 + 29 + 31;
				return numDays;
			} else {
				numDays = day + (2 * 31) + 28;
				return numDays;
			}
		case 5:
			if (leap_year == true) {
				numDays = day + (2 * 31) + 30 + 29;
				return numDays;
			} else {
				numDays = day + (2 * 31) + 30 + 28;
				return numDays;
			}
		case 6:
			if (leap_year == true) {
				numDays = day + (3 * 31) + 30 + 29;
				return numDays;
			} else {
				numDays = day + (3 * 31) + 30 + 28;
				return numDays;
			}
		case 7:
			if (leap_year == true) {
				numDays = day + (3 * 31) + (2 * 30) + 29;
				return numDays;
			} else {
				numDays = day + (3 * 31) + (2 * 30) + 28;
				return numDays;
			}
		case 8:
			if (leap_year == true) {
				numDays = day + (4 * 31) + (2 * 30) + 29;
				return numDays;
			} else {
				numDays = day + (4 * 31) + (2 * 30) + 28;
				return numDays;
			}
		case 9:
			if (leap_year == true) {
				numDays = day + (5 * 31) + (2 * 30) + 29;
				return numDays;
			} else {
				numDays = day + (5 * 31) + (2 * 30) + 28;
				return numDays;
			}
		case 10:
			if (leap_year == true) {
				numDays = day + (5 * 31) + (3 * 30) + 29;
				return numDays;
			} else {
				numDays = day + (5 * 31) + (3 * 30) + 28;
				return numDays;
			}
		case 11:
			if (leap_year == true) {
				numDays = day + (6 * 31) + (3 * 30) + 29;
				return numDays;
			} else {
				numDays = day + (6 * 31) + (3 * 30) + 28;
				return numDays;
			}
		case 12:
			if (leap_year == true) {
				numDays = day + (6 * 31) + (4 * 30) + 29;
				return numDays;
			} else {
				numDays = day + (6 * 31) + (4 * 30) + 28;
				return numDays;
			}
   		default:
   			//This is not necessary but needs to be included to complete "switch" statement.
   			return 0;
   	  }
   	  
   	}
//*********************************************************************************************
   
   public int differenceOfDays(int month, int day, int year, boolean leap_year) {
	   
	   // Method to calculate number of days for a specified date since January 1, 1900
	   // Precondition:  Date; if leap year or not
	   // Postcondition:  Number of days since 1 January 1900
	   
	   int numberOfDays;
	   int countYear;
	   for (count = 1900; count <= year; count++) {
	   		if (count % 4 == 0 && count % 400 == 0)
	   			numberOfDays = numberOfDays + 366;
   			else
   				numberOfDays = numberOfDays + 365;
		}
		if (month == 1)
			continue;
		else if (month > 1 && leap_year == true)
			{
			}
		else
			{
			}

			 
	   

   }
 
//***********************************************************************************************
   
   public int differenceOfDays (int monthOne, int dayOne, int yearOne, int monthTwo, int dayTwo, int yearTwo, boolean leapYearOne,
		  boolean leapYearTwo) {
	   
	   // Method to calculate number of days from one date to another
	   //Precondition:  Date 1 and Date 2
	   //Postcondition:  Number of days between the two dates.
	   
	   switch (monthOne) {
  		case 1:
  			return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne);
  		case 2:
  			return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + 31;
  		case 3:
  			if (leapYearOne == true)
  				if (leapYearTwo == true)
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + 31 + 29 + 1;
  				else
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + 31 + 29;
  			else
  				return ((year - 1900) * 365) + (dayTwo - dayOne) + 31 + 28;
  		case 4:
  			if (leapYearOne == true)
  				if (leapYearTwo == true)
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (2 * 31) + 29 + 1;
  				else
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (2 * 31) + 29;
  			else
  				return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (2 * 31) + 28;
  		case 5:
  			if (leapYearOne == true)
  				if (leapYearTwo == true)
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (2 * 31) + 30 + 29 + 1;
  				else
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (2 * 31) + 30 + 29;
  			else
  				return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (2 * 31) + 30 + 28;
  		case 6:
  			if (leapYearOne == true)
  				if (leapYearTwo == true)
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (3 * 31) + 30 + 29 + 1;
  				else
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (3 * 31) + 30 + 29;
  			else
  				return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (3 * 31) + 30 + 28;
  		case 7:
  			if (leapYearOne == true)
  				if (leapYearTwo == true)
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (3 * 31) + (2 * 30) + 29 + 1;
  				else
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (3 * 31) + (2 * 30) + 29;
  			else
  				return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (3 * 31) + (2 * 30) + 28;
  		case 8:
  			if (leapYearOne == true)
  				if (leapYearTwo == true)
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (4 * 31) + (2 * 30) + 29 + 1;
  				else
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (4 * 31) + (2 * 30) + 29;
  			else
  				return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (4 * 31) + (2 * 30) + 28;
  		case 9:
  			if (leapYearOne == true)
  				if (leapYearTwo == true)
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (5 * 31) + (2 * 30) + 29 + 1;
  				else
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (4 * 31) + (2 * 30) + 29;
			else
  				return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (5 * 31) + (2 * 30) + 28;
  		case 10:
  			if (leapYearOne == true)
  				if (leapYearTwo == true)
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (5 * 31) + (3 * 30) + 29 + 1;
  				else
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (4 * 31) + (2 * 30) + 29;
			else
  				return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (5 * 31) + (3 * 30) + 28;
  		case 11:
  			if (leapYearOne == true)
  				if (leapYearTwo == true)
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (6 * 31) + (3 * 30) + 29 + 1;
  				else
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (4 * 31) + (2 * 30) + 29;
  			else
  				return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (6 * 31) + (3 * 30) + 28;
  		case 12:
  			if (leapYearOne == true)
  				if (leapYearTwo == true)
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (6 * 31) + (4 * 30) + 29 + 1;
  				else
  					return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (4 * 31) + (2 * 30) + 29;
  			else
  				return ((yearTwo - yearOne) * 365) + (dayTwo - dayOne) + (6 * 31) + (4 * 30) + 28;
			default:
				return 0;
  }
  
	   

   }
} // end Date.java

