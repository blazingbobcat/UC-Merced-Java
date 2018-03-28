//Josh Klipstein -- Lab Section 1
//This object is any person that the user registers into the survey program.  It includes
//birth date, gender and name as private instance variables.  The birth date is determined
//by another object called Date and is declared as a Date type.
import java.util.*;
public class Person { //Here are the instance variables:
	private String name; //name of person
	private char gender; //gender of person
	private Date birthDate;//birth date of person (as object of three parts)
	private int quietTime;//how much the person values quiet time.
	private int music;//how much the person likes to listen to music.
	private int reading;//how much the person likes reading.
	
	//The default constructor sets the "default" information for an undefined person.
	public Person( ) {
		name = " ";
		gender = 'M';
		Date bd1 = new Date(1,1,1900);
		birthDate = bd1;
		quietTime = 5;
		music = 5;
		reading = 5;	
	 }
	
	//The input method gathers all the information for one person.
	public void input ( ) {
		String[] inputName = new String[2];
		String inputGender;
		int inputMonth;
		int inputDay;
		int inputYear;
		int inputMusic;
		int inputQuietTime;
		int inputReading;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter name of student: ");
		System.out.println("First: ");
		inputName[0] = sc.next();
		System.out.println("Last: ");
		inputName[1] = sc.next();
		System.out.println("Please enter gender: ");
		inputGender = sc.next();
		while (inputGender.equalsIgnoreCase("M") == false && 
				inputGender.equalsIgnoreCase("F") == false) {
			System.out.println("Please enter 'M' or 'F' as gender.");
			inputGender = sc.next();
		}
		System.out.println("Please enter date of birth (month, day, year): ");
		System.out.println("Month: ");
		inputMonth = sc.nextInt();
		while (inputMonth < 1 || inputMonth > 12) {
			System.out.println("Please enter 1 - 12 for month: ");
			inputMonth = sc.nextInt();
		}
		System.out.println("Day: ");
		inputDay = sc.nextInt();
		while (inputDay < 1 || inputDay > 31) {
			System.out.println("Please enter 1 - 31 for day: ");
			inputDay = sc.nextInt();
		}
		System.out.println("Year: ");
		inputYear = sc.nextInt();
		while (inputYear < 1900 || inputYear > 3000) {
			System.out.println("Please enter 1900 - 3000 for year: ");
			inputYear = sc.nextInt();
		}
		System.out.println("Please enter preference for quiet time (1 - 10): ");
		inputQuietTime = sc.nextInt();
		while (inputQuietTime < 1 || inputQuietTime > 10) {
			System.out.println("Please enter 1 - 10: ");
			inputQuietTime = sc.nextInt();
		}
		System.out.println("Please enter preference for reading (1 - 10): ");
		inputReading = sc.nextInt();
		while (inputReading < 1 || inputReading > 10) {
			System.out.println("Please enter 1 - 10: ");
			inputReading = sc.nextInt();
		}
		System.out.println("Please enter preference for listening to music (1 - 10): ");
		inputMusic = sc.nextInt();
		while (inputMusic < 1 || inputMusic > 10) {
			System.out.println("Please enter 1 - 10: ");
			inputMusic = sc.nextInt();
		}
		name = inputName[0] + " " + inputName[1];
		gender = Person.toChar(inputGender);
		Date d = new Date(inputMonth, inputDay, inputYear);
		birthDate = d;
		quietTime = inputQuietTime;
		music = inputMusic;
		reading = inputReading;
	}
	
	//The accessor methods are necessary because all instance variables are private.
	public String getName( ) {
		return name;
	}
	
	public char getGender( ) {
		return gender;
	}
	
	public double getQuietTime( ) {
		return quietTime;
	}
	
	public double getMusic ( ) {
		return music;
	}
	
	public double getReading( ) {
		return reading;
	}
	
	public double getAge(Object person) {
		return 2008 - birthDate.getYear();
	}
	
	
	//The output method prints the matchScore on the screen as well as all the inputed and
	//calculated information.
	public static void output(double matchScore, double age1, double age2, double quietTime1, 
			double quietTime2, double reading1, double reading2, double music1, double music2,
			String name1, String name2) {
		System.out.println("Match Score: " + matchScore);
		System.out.println("Person 1 name: " + name1);
		System.out.println("Person 2 name: " + name2);
		System.out.println("Person 1 age: " + age1);
		System.out.println("Person 2 age: " + age2);
		System.out.println("Quiet time preference 1: " + quietTime1);
		System.out.println("Quiet time preference 2: " + quietTime2);
		System.out.println("Reading preference 1: " + reading1);
		System.out.println("Reading preference 2: " + reading2);
		System.out.println("Music preference 1: " + music1);
		System.out.println("Music preference 2: " + music2);
	}
	
	//This method converts an input String into a type char.
	public static char toChar(String string) {
		return string.charAt(0);
	}
	
}	
	
