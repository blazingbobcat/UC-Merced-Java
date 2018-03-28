/* Josh Klipstein -- Lab section 005

	This program takes in 10 integer values, finds the maximum of those values and prints it
on screen.  */
import java.util.*;

public class ArrayErrors
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[] list = new int[10];

		System.out.print("This progam finds the maximum ");
		System.out.println("value in a list of ten integers.\n\n");

		for(int i=0; i < list.length; i++)
		{
			System.out.print("Enter a value: ");
			list[i] = keyboard.nextInt();
		}

		int maximum = 0;

		for(int j=0; j < list.length; j++)
		{
			if(maximum < list[j])
				maximum = list[j];
		}

		System.out.println("The maximum value is " + maximum);
	}
}