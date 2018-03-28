/*Josh Klipstein

Lab Section 003

October 19, 2007

Arrays exercise */
import java.util.Scanner;
public class AverageValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; //initialize length
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Hello.  This program computes average value.  Please enter number of data entries: ");
		n = kbd.nextInt(); //read input into length 
		System.out.println("Thank you.");
		
		int [ ] values; //decalre array "values"
		values = new int [n]; //set array length
		int i;
		
		for (i = 0; i < n; i++) { //Start input loop
			System.out.println("Please enter a number: ");
			values [i] = kbd.nextInt();
		}
		
		System.out.println("");
		System.out.println("Thank you."); //Be curteous
		
		double average; //initialize average
		double total = 0.0; //set "total" to 0
		
		for (i = 0; i < n; i++) { //add values together and store in "total"
			total = total + values [i];
		}
		
		average = total / n; //Average is total divided by length
		
		System.out.println("The average is: " + average);
		System.out.println(""); // Now we want to find a maximum value.
		
		int max = -99999; //initalize maximum value
		
		for (i = 0; i < n; i++) {
			if (values [i] > max) {
				max = values [i];
			}
		}	
			System.out.println("Maximum Value: " + max);
		System.out.println("");
		
		int searchValue;
		//All of a sudden, Professor Milostan says, "Where did I put that score?"
		System.out.println("SEARCH ENGINE ACTIVATED.  Please enter value you are looking for: ");
		searchValue = kbd.nextInt(); //read in search value
		System.out.println("Thank you.");
		System.out.println("");
		
		int a = 0; //Find out if value is found
		
		for (i = 0; i < n; i++) { //search for value
			if (searchValue == values [i]) {
			a = 1; //Value is found
			break;
		} else {
			a = 0; //Value is not found
			continue;
		}
	}
	
	if (a == 1) { //Read in results and tell user
		System.out.println("Value found at index number: " + i);
	} else  if (a == 0) {
		System.out.println("Value not found.");
	}
	
	}
} //end program


