//Josh Klipstein Lab Section 3
// This program calculates total loan amount after m number of months depending on
// how much the user pays each month.
import java.util.Scanner;
public class Lab052 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		int counter;
		double interestRate;
		double loanAmount;
		double loanPayment;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Loan Calcuation Program!");
		System.out.println("Please enter loan length (months): ");
		m = sc.nextInt();
		System.out.println("Please enter interest rate (as a decimal): ");
		interestRate = sc.nextDouble();
		System.out.println("Please enter total loan amount: ");
		loanAmount = sc.nextDouble();
		System.out.println("Please enter monthly payment amount: ");
		loanPayment = sc.nextDouble();
		System.out.println("Thank you.");
		System.out.println("The total amount you entered is: $ " + loanAmount);
		for (counter = 0; counter <= m; counter++) {
		loanAmount = loanAmount - loanPayment;
		loanAmount = loanAmount * (interestRate + 1);
		if (counter % 6 == 0) {
		System.out.println("The total loan amount after six months is: $" + loanAmount);
		}
		}
		System.out.println("Program finished.");
		System.out.println("Total amount after " + m + " months: $ " + loanAmount);
		if (loanAmount > 0) {
		System.out.println("Your loan has not been paid off yet.");
		}
		else
		{  System.out.println("Your loan has been paid off.");
		}
		
		
		

	}

}
