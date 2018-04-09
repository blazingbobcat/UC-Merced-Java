//Josh Klipstein 
//Lab Section 3
/* This program calculates square footage of a room */
import java.util.Scanner;
public class Lab081 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in1 = new Scanner(System.in);
		double length;
		double width;
		System.out.println("Hello, welcome to our carpeting catalog.  Please enter length of carpet you need: ");
		length = in1.nextDouble();
		System.out.println("Now, please enter width: ");
		width = in1.nextDouble();
		System.out.println("");
		System.out.println("Thank you.");
		System.out.println("");
		System.out.println("The carpet you want is " + Lab081.calcSquareFeet(length, width) + " square feet in size.");
		System.out.println("Thank you for using this program.");		

	}
		
	public static double calcSquareFeet (double length, double width) {
		double squareFeet;
		squareFeet = length * width;
		return squareFeet;
		}

}
