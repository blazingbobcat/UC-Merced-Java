//Josh Klipstein Lab Section 3
/*  Purpose:
	To convenrt an input radian measure to an output degrees measure
*/
import java.util.Scanner;

public class RadiansToDegrees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc = new Scanner(System.in); //create scanner
	double degrees; //output degrees
	
	//Prompt user to input radians.
	System.out.print("Enter angle measure in radians: ");
	float radians = sc.nextFloat(); // input radians
	
	//Convert input to degrees
	degrees = (radians * 180)/Math.PI;
	
	//Afterwards, print the result
	System.out.println("Angle measure in degrees: " + degrees);
	
	}

}
