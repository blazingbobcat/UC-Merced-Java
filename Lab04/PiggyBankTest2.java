//Josh Klipstein -- Lab Section 1
//26 February 2008
import java.util.*;
public class PiggyBankTest2 {
	
	public static void main(String[] args) {

		PiggyBank2 piggyBank = new PiggyBank2();
		Scanner kbd = new Scanner(System.in);
		int q;
		int d;
		int n;
		int p;
	
		System.out.println("Please enter number of quarters to put into piggy bank: ");
		q = kbd.nextInt();
		piggyBank.setQuarters(q);
		System.out.println("Please enter number of dimes: ");
		d = kbd.nextInt();
		piggyBank.setDimes(d);
		System.out.println("Please enter number of nickels: ");
		n = kbd.nextInt();
		piggyBank.setNickels(n);
		System.out.println("Please enter number of pennies: ");
		p = kbd.nextInt();
		piggyBank.setPennies(p);
		
		System.out.println("I have " + piggyBank.getNumOfCoins() + " coins in my piggy bank.");
		System.out.println("They are worth " + piggyBank.computeValue() + " dollars.");
		System.out.println("After tripling my number of coins, I have " + (3 * piggyBank.getPennies()) + " pennies,");
		System.out.println((3 * piggyBank.getQuarters()) + " quarters, ");
		System.out.println((3 * piggyBank.getDimes()) + " dimes and ");
		System.out.println((3 * piggyBank.getNickels()) + " nickels.");  

	}

}
