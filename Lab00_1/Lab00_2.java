/*Example00_2.java This program illustrates the local and global variables and call-by-value. 
This program computes the side area, the cross section area and the total area of a cylinder.  
This program also calculates surface area and volume of a sphere.  It is possible to use different 
methods of the same name when one method uses more parameters, it uses different 
types of parameters or both.*/  
import java.util.Scanner;
public class Lab00_2 {

	/**
	 * @param args
	 */
	public static final double PI = 3.14159; // This variable is defined globally in the class, known to all methods in this class as PI 
	public static final double conversion = 0.3937; // This is the Cm to inch conversion factor 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double h,r; // variables local to the main method
		int choice;
		Scanner kbd = new Scanner(System.in);
		System.out.println("Welcome to the area calculator.  Please enter 1 for cylinder and 2 for sphere.");
		choice = kbd.nextInt();
		while (choice < 1 || choice > 2){
			System.out.println("\nPlease enter a 1 for cylinder or 2 for sphere.");
			choice = kbd.nextInt();		
		}
		
		if(choice == 1 ) {
			System.out.println("Enter the radius and the height of the cylinder in Cm <Enter> "); 
			r = kbd.nextDouble();
			h = kbd.nextDouble();
			System.out.println("Before I do any computation or call any functions, I want to let you know that"); 
			System.out.println("you have entered r = " + r + " and h = " + h + "."); 
			System.out.println("I am planning to use inches, thus in the first function, I will convert r, and "); 
			System.out.println("in the second one I will convert h \n"); 
			System.out.println("The cross section area of the cylinder is " + area(r) + "  inch-sqr. "); 
			System.out.println("The side area of the cylinder is " + area(r,h) + " inch-sqr. \n\n");
			System.out.println("The total area of the cylinder is " + total_area(r,h) + " inch-sqr.");
			System.out.println("The volume of the cylinder is " + volume(r,h) + " inch-cube.");
		} else if (choice == 2) {
			System.out.println("Enter the radius of the sphere in Cm <Enter> ");
			r = kbd.nextDouble();

			System.out.println("You have entered r = " + r + ".");
			System.out.println("Please be aware all results are in inches.");
			System.out.println("\nThe surface area of the sphere is " + area2(r) + " inch-sqr.");
			System.out.println("\nThe volume of the sphere is " + volume(r) + " inch-cube.");
		}
		System.out.println("\n\nThank you for using this program.");
	}
	
	public static double area(double r)
	{ 
	  //Cross section area includes the disks at the bottom and the top 
	   r = r * conversion;  // converting r to inch 
	   return 2*PI*r*r; 
	} 
	public static double area(double r, double h) 
	{ 
	   double m_area; //variable local to area function 
	   h = h * conversion;  // converting h to inch 
	   r = r * conversion;  // converting r to inch 
	   m_area = 2*PI*r*h; 
	   return m_area; 
	}
	public static double total_area(double r, double h)
	{ /*In this method, we take the cross section area and side area of
	a cylinder and add them together to find total area.  The radius and height
	are both converted to inches and both equations to find the two areas are 
	evaluated before added together.  The method then returns the total area to main. */
		r = r * conversion; // converting r to inches
		h = h * conversion; // converting h to inches
		double t_area = (2*PI*r*h) + (2*PI*r*r);
		return t_area;
	}
	public static double area2(double r) 
	{ //This is the method for calculating surface area of a sphere.
		r = r * conversion;
		return 4 * PI * r * r;
	}
	public static double volume(double r)
	{//This method used for calculating volume of sphere
		r = r * conversion;
		return (4.0 / 3.0) * PI * r * r * r;
	}
	public static double volume(double r, double h)
	{
		r = r * conversion;
		return (PI * r * r ) * h;
	}
		
}//end Lab 00_2


