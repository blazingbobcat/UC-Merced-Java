//Josh Klipstein
//Lab section 003
//This program is the self-checkout program at Lani's Zen Garden in Springfield, IL.  It
//calculates subtotal by how many items are purchashed (without tax) and calculates any
//discounts the purchase qualifies for.
import java.util.Scanner;
public class ZenGardenSelfCheckout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int juniperPlant;
		int bambooRake;
		int meditationRock;
		int pruners;
		double subtotal;
		double discount;
		double total;
		Scanner kbd = new Scanner(System.in);
		System.out.println("Welcome to Lani's Zen Garden and Bonsai Supplies, the premier Japanese garden store of Springfield, Illinois.");
		System.out.println("Please enter the number of items you want to purchase: ");
		System.out.println("Juniper Bonsai plant: ");
		juniperPlant = kbd.nextInt();
		System.out.println("");
		System.out.println("Stainless steel Bonsai pruners: ");
		pruners = kbd.nextInt();
		System.out.println("");
		System.out.println("Hand-made bamboo Zen garden rake: ");
		bambooRake = kbd.nextInt();
		System.out.println("");
		System.out.println("Large Meditation Rock: ");
		meditationRock = kbd.nextInt();
		System.out.println("");
		System.out.println("Thank you.");
		subtotal = ZenGardenSelfCheckout.calcSubtotal(juniperPlant, bambooRake, pruners, meditationRock);
		discount = ZenGardenSelfCheckout.calcDiscount(subtotal);
		total = subtotal - discount;
		System.out.println("Would you like an itemized receipt (enter 1 for yes, 0 for no)? ");
		int goAhead;
		goAhead = kbd.nextInt();
		if (goAhead > 1) {
			System.out.println("Please enter 1 for yes or 0 for no. ");
			goAhead = kbd.nextInt();
		} else if (goAhead == 1) {
			System.out.println("Here is a list of the items you bought, with prices: ");
			ZenGardenSelfCheckout.printItemizedReceipt(juniperPlant, bambooRake, pruners, meditationRock);
			System.out.println("");
			System.out.println("Here is your receipt: ");
		} else {
			System.out.println("Okay.  Here is your receipt: "); }
		ZenGardenSelfCheckout.printReceipt(subtotal, discount, total);
		System.out.println("");
		System.out.println("Thank you for shopping at Lani's Zen Garden & Bonsai Supplies.");
		}
	
	public static double calcSubtotal(int plants, int rakes, int pruners, int rocks) {
		double subtotal;
		subtotal = (plants * 29.95) + (rakes * 39.95) + (pruners * 19.95) + (rocks * 250.0);
		return subtotal;
	}
	
	public static double calcDiscount(double subtotal) {
		double priceOff = 0.;
		if (subtotal >= 500.) {
			priceOff = subtotal * .25;
		} else if (subtotal >= 100. & subtotal < 500.) {
			priceOff = subtotal * .10;
		} else if (subtotal < 100) {
			priceOff = 0.;
		}
		return priceOff;
	}
	
	public static void printItemizedReceipt(int plants, int rakes, int pruners, int rocks) {
		System.out.println("");
		if (plants > 0) {
			System.out.println("Juniper Bonsai plants at 29.95: " + plants);
			System.out.println("");
		} if (rakes > 0) {
			System.out.println("Hand-Made Bamboo Zen Garden Rakes at 39.95: " + rakes);
			System.out.println("");
		} if (pruners > 0) {
			System.out.println("Stainless steel Bonsai pruners at 19.95: " + pruners);
			System.out.println("");
		} if (rocks > 0) {
			System.out.println("Meditation Rocks at 250.00: " + rocks);
			System.out.println("");
		}
	}
	public static void printReceipt(double subtotal, double discount, double total) {
		System.out.println("Subtotal: " + subtotal);
		System.out.println("");
		System.out.println("Discount: -" + discount);
		System.out.println("");
		System.out.println("Grand total: " + total);
		System.out.println("");
	} 
			
}

