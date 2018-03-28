/* Josh Klipstein Lab section 3, October 12, 2007.  This program caluculates total price
for pants bought at retail store.  It asks the user how many of each pants they bought:
jeans, sweats and slacks; and adds the price of each times number of pants purchased to
a sub-total.  Then it caluculates in all discounts depending on which discounts the
customer qualifies for and asks the user if they want to see a list of what the customer
purchased.  If not, only the grand total is displayed.  The program then thanks the 
customer for shopping. */
import java.util.Scanner;
public class Program1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize all variables that will be used
		int jeans;
		int slacks;
		int sweats;
		double subtotal;
		double total;
		double discount;
		int showPants;
		Scanner inpt = new Scanner(System.in);
		//Greet customer and print instructions
		System.out.println("Welcome to Milostan's!");
		System.out.println("At Milostan's, we sell pants, pants and more!");
		System.out.println("");
		System.out.println("This program caluclates the price for how many pants bought: ");
		System.out.println("Jeans, Slacks or Sweats");
		System.out.println("calucluates all discounts if customer qualifies");
		System.out.println("and asks if customer wants to see receipt.");
		System.out.println("");
		//Prompt user for number of pants
		System.out.println("Please enter number of pants the customer wants:");
		System.out.println("Jeans: ");
		jeans = inpt.nextInt();
		System.out.println("");
		System.out.println("Slacks: ");
		slacks = inpt.nextInt();
		System.out.println("");
		System.out.println("Sweats: ");
		sweats = inpt.nextInt();
		System.out.println("");
		System.out.println("Thank you.");
		
		//Caluclate subtotal by adding each number of pants times prices
		subtotal = (jeans * 35) + (slacks * 45) + (sweats * 20);
		
		//Calulate discount based on subtotal
		if (subtotal >= 200.) {
			discount = 25.;
			} else
			if (subtotal >= 100. & subtotal < 200.) {
				discount = 10.;
				} else {
				discount = 0.;
				}
		
		//Calulate Total
		total = subtotal - discount;
		
		//Ask if customer would like to see receipt
		System.out.println("");
		System.out.println("Would the customer like to see a receipt?");
		System.out.println("Enter '1' as yes and '0' as no");
		showPants = inpt.nextInt();
		System.out.println("");
		
		//Print out receipt if "1" is entered, nothing but total if "0" is entered
		if (showPants == 1) {
			if (jeans > 0) {
				System.out.println("Jeans (at $35 each): " + jeans);
				System.out.println("");
				} if (slacks > 0) {
					System.out.println("Slacks (at $45 each): " + slacks);
					System.out.println("");
					} if (sweats > 0) {
						System.out.println("Sweats (at $20 each): " + sweats);
						System.out.println("");
						}
			} 
			
			//Print out bill for items purchased			
			System.out.println("Sub Total: $" + subtotal);
			System.out.println("");
			System.out.println("-Discount: $" + discount);
			System.out.println("");
			System.out.println("Total price for purchase: $" + total);
			System.out.println("");
			System.out.println("Thank you for shopping at Milostan's.");	

	}

}
//End program