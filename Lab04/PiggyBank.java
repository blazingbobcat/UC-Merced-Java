//Josh Klipstein -- Lab Section 1
//26 February 2008
public class PiggyBank {

	public int quarters;
	public int dimes;
	public int nickels;
	public int pennies;
	
	public int getNumOfCoins(int numberOfQuarters, int numberOfDimes, int numberOfNickels, int numberOfPennies) {
		return numberOfQuarters + numberOfDimes + numberOfNickels + numberOfPennies;
	}
	
	public int getQuarters(int numberOfQuarters) {
		quarters = numberOfQuarters;
		return quarters;
	}
	
	public int getDimes(int numberOfDimes) {
		dimes = numberOfDimes;
		return dimes;
	}
	
	public int getNickels(int numberOfNickels) {
		nickels = numberOfNickels;
		return nickels;
	}
	
	public int getPennies(int numberOfPennies) {
		pennies = numberOfPennies;
		return pennies;
	}
	
	public double computeValue(int numberOfQuarters, int numberOfDimes, int numberOfNickels, int numberOfPennies) {
		return ((25. * numberOfQuarters) + (10. * numberOfDimes) + (5. * numberOfNickels) + (1. * numberOfPennies)) / 100;
	}


}
