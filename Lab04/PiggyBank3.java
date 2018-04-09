//Josh Klipstein -- Lab Section 1
//26 February 2008
public class PiggyBank3 {
	
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	
	public PiggyBank3() {
		quarters = 0;
		dimes = 0;
		nickels = 0;
		pennies = 0;
	}
	
	public PiggyBank3(int q, int d, int n, int p) {
		quarters = q;
		dimes = d;
		nickels = n;
		pennies = p;
	}
	
	public int getNumOfCoins() {
		return pennies + dimes + nickels + quarters;
	}
	
	public int getQuarters() {
		return quarters;
	}
	
	public int getDimes() {
		return dimes;
	}
	
	public int getNickels() {
		return nickels;
	}
	
	public int getPennies() {
		return pennies;
	}
	
	public void setQuarters(int q) {
		quarters = q;
	}
	
	public void setDimes(int d) {
		dimes = d;
	}
	
	public void setNickels(int n) {
		nickels = n;
	}
	
	public void setPennies(int p) {
		pennies = p;
	}
	
	public boolean equalsNumberCoins(int q, int d, int n, int p) {
		if (quarters == q)
			if (dimes == d)
				if (nickels == n)
					if (pennies == p)
						return true;
					else
						return false;
				else
					return false;
			else
				return false;
		else
			return false;
	}
	
	public double computeValue() {
		return ((25. * quarters) + (10. * dimes) + (5. * nickels) + (1. * pennies)) / 100;
	}

}
