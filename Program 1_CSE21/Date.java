//Josh Klipstein -- Lab Section 1
//This object represents the birth date of each registered "Person" in the survey.  It has
//private instance variables year (from 1900 - 3000), month (1-12) and day, which depends on
//month.  It creates a birth date object, which the "Person" object uses.
public class Date {
	private int month;
	private int day;
	private int year;
	
	public Date ( ) {
		month = 1;
		day = 1;
		year = 1900;
	}
	
	public Date (int theMonth, int theDay, int theYear) {
		month = theMonth;
		day = theDay;
		year = theYear;
	}
	
	public double getYear( ) {
		return year;
	}
	
	public double getMonth( ) {
		return month;
	}
	
	public double getDay( ) {
		return day;
	}

}
