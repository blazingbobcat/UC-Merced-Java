//Josh Klipstein - Lab Section 3
//This program evaluates a function on the interval
//(-1,3) by an x-value of "0.1".
public class FunctionEvaluation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	double x;
	System.out.println("Values of y = x^2 - 3x + 2 on interval (-1,3) by 0.1:");
	System.out.println("");
	for (x = -1; x <= 3; x = x + .1) {
	double y = (x*x) - (3*x) +2;
	System.out.println(y);
	}

	}

}
