//Josh Klipstein
//Lab section 003
//This program calculates amount of paint (in gallons) needed to paint a room of a certain length width and height.
import java.util.Scanner;
public class Lab082 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length;
		double width;
		double height;
		Scanner in1 = new Scanner(System.in);
		System.out.print("Hello.  Welcome to our paint catalogue.  Please enter length of room you want to paint: ");
		length = in1.nextDouble();
		System.out.print(" Width: ");
		width = in1.nextDouble();
		System.out.print(" Height: ");
		height = in1.nextDouble();
		System.out.println("Thank you.");
		System.out.println("Calculating...");
		System.out.println("");
		System.out.println("The amount of paint you need is: " + Lab082.howManyGallons(length, width, height) + " gallons");

	}
	
	public static double howManyGallons (double l, double w, double h) {
		double gallons;
		gallons = ((2 * l) * (2 * w) * h) / 18.5;
		return gallons;
	}

}
