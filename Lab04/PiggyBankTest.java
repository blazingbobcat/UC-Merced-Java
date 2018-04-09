//Josh Klipstein -- Lab Section 1
//26 February 2008
import java.util.*;
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in1 = new Scanner(System.in);
		PiggyBank pg = new PiggyBank();
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		
		System.out.println("Please enter number of quarters to put into piggy bank: ");
		quarters = in1.nextInt();
		System.out.println("Please enter number of dimes: ");
		dimes = in1.nextInt();
		System.out.println("Please enter number of nickels: ");
		nickels = in1.nextInt();
		System.out.println("Please enter number of pennies: ");
		pennies = in1.nextInt();
		System.out.println("There are " + pg.getNumOfCoins(quarters, dimes, nickels, pennies) + " coins in the box.");
		System.out.println("They are worth " + pg.computeValue(quarters, dimes, nickels, pennies) + " dollars."); 

	}

}
