//Josh Klipstein
//Lab Section 003
//This program takes two masses (measures) and caluclates gravitational force given the distance between them.
import java.util.Scanner;
public class Lab083 {
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double m1;
		double m2;
		double r;
		Scanner inp = new Scanner(System.in);
		System.out.print("This program calculates gravitational force between two masses.  Please enter mass one (in kilograms): ");
		m1 = inp.nextDouble();
		System.out.println("Mass two: ");
		m2 = inp.nextDouble();
		System.out.println("Distance between the masses (in meters): ");
		r = inp.nextDouble();
		System.out.println("Thank you.");
		System.out.println("Gravitational force between m1 and m2 is: " + Lab083.calcGravForce(m1, m2, r) + " Newtons.");
		System.out.println("Thank you for using this program.");
		 
	}
	
	public static double calcGravForce(double mass1, double mass2, double distance) {
		double gravForce;
		gravForce = (6.672E-11 * mass1 * mass2) / (distance * distance);
		return gravForce;
	}
}
