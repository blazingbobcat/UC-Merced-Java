//Josh Klipstein - Lab Section 3
import java.util.Scanner;

public class IterationPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int limit = sc.nextInt();
		System.out.println("");
		
		int i;
		for (i=1; i<=limit; i++) {
		System.out.println(i);
		}
		
		System.out.println("");
		
		i=1;
		while (i <= limit) {
		System.out.println(i);
		i++;
		}
		
		System.out.println("");
		
		i=1;
		do
		{
		System.out.println(i);
		i++;
		} while (i <= limit);
		
		System.out.println("");
		
		i=0;
		do {
		System.out.println(i);
		i = i + 2;
		} while (i <= limit);
		
		System.out.println("");
		
		int factorial = 1;
		i=1;		
		while (i <= limit) {
		factorial = factorial * i;
		i++;
		}
		
		System.out.println("");
		System.out.println("Factorial of number: " + factorial);
		
	}

}
