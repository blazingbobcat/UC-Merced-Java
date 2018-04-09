//Josh Klipstein -- Lab Section 003
//September 21, 2007
import java.util.*;

public class Lab034
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int numerator;
		int denominator;

		System.out.println("This program divides two numbers.");
		System.out.print("Enter the numerator: ");
		numerator = keyboard.nextInt();
		System.out.print("Enter the denominator: ");
		denominator = keyboard.nextInt();
		if (denominator == 0) {
		System.out.println("Can not divide by zero.");
		} else {
// When a value of 0 was used, the program output "Infinity" because the result is to large
// to be expressed as an integer. 
		System.out.print(numerator + "/" + denominator + " = ");
		System.out.println((double) numerator/denominator);
	}
}
}