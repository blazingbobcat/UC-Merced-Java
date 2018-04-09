//Lab00_1.java This program illustrates the local and global variables and call-by-value. 
//This program computes the side area and the cross section area of a cylinder 

import java.util.Scanner;
public class Lab00_1 {

	/**
	 * @param args
	 */
	 static double PI = 3.14159; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double h,r; // variables local to the main method
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Enter the radius and the height of the cylinder in Cm <Enter> "); 
		r = kbd.nextDouble();
		h = kbd.nextDouble();
		System.out.println("Before I do any computation or call any methods, I want to let you know that"); 
		System.out.println("you have entered r = " + r + " and h = " + h + "."); 
		System.out.println("I am planning to use inches, thus in the first method, I will convert r, and "); 
		System.out.println("in the second one I will convert h \n"); 
		System.out.println("The cross section area of the cylinder is " + cross_area(r) + "  inch-sqr. "); 
		System.out.println("The side area of the cylinder is " + side_area(r,h) + " inch-sqr. \n\n");
		System.out.println("The total area of the cylinder is " + total_area(r,h) + " inch-sqr."); 

	}
	public static double cross_area(double r) 
	{ 
	  //Cross section area includes the disks at the bottom and the top 
	   r = r * 0.3937;  // converting r to inch 
	   return 2*PI*r*r; 
	} 
	public static double side_area(double r, double h) 
	{ 
	   double area; //variable local to Side_area method 
	   h = h * 0.3937;  // converting h to inch
	   r = r * 0.3937;  // converting r to inch 
	   area = 2*PI*r*h; // logical error caused by failing to convert r to inches
	   return area; 
	}
	public static double total_area(double r, double h)
	{ /*In this method, we take the cross section area and side area of
	a cylinder and add them together to find total area.  The radius and height
	are both converted to inches and both equations to find the two areas are 
	evaluated before added together.  The method then returns the total area to main. */
		r = r * 0.3937; // converting r to inches
		h = h * 0.3937; // converting h to inches
		double t_area = (2*PI*r*h) + (2*PI*r*r);
		return t_area;
	}
		

}//end Lab00_1


