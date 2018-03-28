//Josh Klipstein - Lab section 3
//This program calculates number of bacteria in two separate
//Petri dishes after intervals of 3 hours.  One Petri dishes'
//bacteria multiplies by 2 after 60 minutes, the other after ninenty.
public class BacteriaGrowth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 1;
		int t = 0;
		
		System.out.println("Number of bacteria in dish A: " + x);
		System.out.println("Number of bacteria in dish B: " + y);
		do {
		t = t + 30;
		
		if (t % 60 == 0) {
		x = x * 2;
		}
		 if (t % 90 == 0) {
		 y = y * 2;
	}
	
	if (t % 180 == 0) {
	System.out.println("");
	System.out.println("Number of bacteria after 3 more hours in dish A: " + x);
		 System.out.println("Number of bacteria after 3 more hours in dish B: " + y);
		 System.out.println("");
		 } 
		 
		 } while (t <= 1440);
		 System.out.println("End twenty-four hour period");
		 

}

}
