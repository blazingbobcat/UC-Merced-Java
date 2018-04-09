//Josh Klipstein Lab Section 3
/* This program takes an input of rows and columns from the user and draws a box
of numbers with those sizes */
import java.util.Scanner;
public class Lab053 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int xCounter;
		int yCounter;
		int xLimit;
		int yLimit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of rows: ");
		xLimit = sc.nextInt();
		System.out.println("Please enter number of columns: ");
		yLimit = sc.nextInt();
		System.out.println("Thank you.");
		System.out.println("");
		for (xCounter = 1; xCounter <= xLimit; xCounter++) {
			System.out.println("");
			for (yCounter = 1; yCounter <= yLimit; yCounter++) {
			System.out.print(yCounter + " ");
			}
		}
			
		

	}

}
