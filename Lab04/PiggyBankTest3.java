//Josh Klipstein -- Lab Section 1
//26 February 2008
public class PiggyBankTest3 {
	
	public static void main(String[] args) {
		
		int randPennies = Math.round(Math.round(Math.random() * 101));
		int randDimes = Math.round(Math.round(Math.random() * 101));
		int randNickels = Math.round(Math.round(Math.random() * 101));
		int randQuarters = Math.round(Math.round(Math.random() * 101));
		
		PiggyBank3 pg3 = new PiggyBank3(randQuarters, randNickels, randDimes, randPennies);
		
		System.out.print("My new piggy bank has " + pg3.getQuarters() + " quarters, " + pg3.getNickels() + " nickels, " + 
			pg3.getDimes() + " dimes and " + pg3.getPennies() + " pennies.\n" );
			
		System.out.println("My new coin bank is worth " + pg3.computeValue() + " dollars.");
		
		/*if (pg3.equalsNumberCoins(randQuarters, randDimes, randNickels, randPennies) == true)
			System.out.println("My old coin bank is the same as my new one!");
			else
			System.out.println("My old coin bank is different.");*/
		}


	}
