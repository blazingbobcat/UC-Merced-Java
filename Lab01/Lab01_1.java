//Josh Klipstein, Lab Section 001, 5 February 2008
//This program calculates the total price of a purchase of 3 different types of pants:  slacks, jeans and sweats.
//The subtotal is subtracted by any discounts the customer qualifies for and the grandtotal is calculated as such.
import java.util.Scanner;
public class Lab01_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int slacks;
		int jeans;
		int sweats;
		int printList;
		int sub;
		int discount;
		Scanner kbd = new Scanner(System.in);
		Lab01_1.intro();
		System.out.print("\n\nPlease enter number of slacks: ");
			slacks = kbd.nextInt();
		System.out.print("\n\nPlease enter number of jeans: ");
			jeans = kbd.nextInt();
		System.out.print("\n\nPlease enter number of sweats: ");
			sweats = kbd.nextInt();
		sub = Lab01_1.subTotal(slacks, jeans, sweats);
		discount = Lab01_1.getDiscount(sub);
		System.out.println("Would you like an itemized reciept (press 1 for yes or 0 for no)?");
		printList = kbd.nextInt();
		if (printList > 1 || printList < 0) {
			System.out.print("\n\nPlease enter 1 for yes or 0 for no.");
		} else if (printList == 1) {
			System.out.print("\n\nOkay.  Here is a list of items you purchased: \n\n");
			Lab01_1.itemList(slacks, jeans, sweats);
			System.out.println("");
			Lab01_1.printTotal(sub, discount);
		} else if (printList == 0) {
			System.out.print("\n\nOkay.\n\n");
			Lab01_1.printTotal(sub, discount);
		}
		System.out.print("\n\nThank you for shopping at Milostan's.");
	}
	
	public static void intro() {
	//This method introduces the cashier to the program and sets instructions. 
		System.out.print("Welcome to Milostan's, your #1 stop department store!  We're all out of everything except");
		System.out.print("\nfor pants.  Please enter number of pants you would like to purchase from three categories:");
		System.out.print("\nSweats ($20), Jeans ($35) and Slacks ($45).");
	}
	
	public static int subTotal(int numSlacks, int numJeans, int numSweats) {
	//This method calculates subtotal by the number of each pair of pants purchased.
		return (45 * numSlacks) + (35 * numJeans) + (20 * numSweats);
	}
	
	public static int getDiscount(int subTotal) {
	//This method checks if customer qualifies for a discount and subtracts from subtotal if they do.
		if (subTotal >= 200) {
			return 15;
		} else if (subTotal >= 100) {
			return 10;
		} else {
			return 0;
		}	
	}
	
	public static void itemList(int numSlacks, int numJeans, int numSweats) {
	//This method prints an itemized receipt (not the total or discount) of the purchased.
		System.out.println("Slacks: " + numSlacks);
		System.out.print("\nJeans: " + numJeans);
		System.out.print("\n\nSweats: " + numSweats);
	}
	
	public static void printTotal(int subTotal, int discountAmount) {
	//This method prints out the total, subtotal and discount amount.
		int total = subTotal - discountAmount;
		System.out.print("\n\nSubtotal: " + subTotal);
		System.out.print("\n\nDiscount: " + discountAmount);
		System.out.print("\n\nTotal: " + total);
	}
}
