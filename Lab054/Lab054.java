//Josh Klipstein Lab section 3
/* This program takes inputs of numbers from a user and adds them to a total value until a
limit is reached. */
import java.util.Scanner;
public class Lab054 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberInput;
		int totalAmount = 0;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Please enter a number: ");
		numberInput = sc.nextInt();
		if (numberInput >= 0) {
		System.out.println("You entered: " + numberInput);
		totalAmount = totalAmount + numberInput;
		System.out.println("Your total is: " + totalAmount);
		} else { continue; } 
		} while (numberInput >= 0);
		System.out.println("Your grand total is: " + totalAmount);
		System.out.println("Thank you.");

	}

}
