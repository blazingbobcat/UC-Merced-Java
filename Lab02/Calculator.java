import java.util.Scanner;
public class Calculator
{
	Scanner kbd = new Scanner(System.in);
	
	public  int add(int x, int y)
	{
		return x + y;
	}

	public  int multiply(int x, int y)
	{
		return x * y;
	}

	public  int subtract(int x, int y)
	{
		return x - y;
	}

	public int divide(int x, int y)
	{
		if(y != 0)
			return x/y;
		else
		{
			System.out.println("Division by zero detected....Returning 0");
			return 0;
		}
	}
	
	public double squareRoot(double x)
	{
		if (x > 0) 
		{
			return Math.sqrt(x);
		} else {
			System.out.println("Number is less than zero... Returning 0.");
			return 0.;
		}
	}
	
	public double add (double x, double y)
	{
		return x + y;
	}
	
	public double subtract (double x, double y)
	{
		return x - y;
	}
	
	public double multiply (double x, double y)
	{
		return x * y;
	}
	
	public double divide (double x, double y)
	{
		if (x > 0)
		{
			return y / x;
		} else {
			System.out.println("Error:  Divide by zero...returning 0.");
			return 0.;
		}
	}	
		 
	
	public void showOptions() {
		System.out.println("This Calculator program adds, subtracts, divides, or multiplies two numbers ");
		System.out.println("and takes the square root of a number just like a basiccalculator would in real life.\n\n");
	}
	
	public static void showResult(int result) {
		System.out.print("\nYour answer is: " + result);
	}
	
	public static void showResult(double result) {
		System.out.print("\nYour answer is: " + result);
	}
	
	public void doOperation(int option) {
		int x;
		int y;
		double s;
		double r;
		int result1;
		double result2;
		
		switch (option) {
			case 1:
				System.out.print("\n\nPlease enter numbers to add: ");
				x = kbd.nextInt();
				y = kbd.nextInt(); 
				result1 = add(x,y);
				showResult(result1);
				break;
			case 2:
				System.out.print("\n\nPlease enter numbers to subtract: ");
				x = kbd.nextInt();
				y = kbd.nextInt(); 
				result1 = subtract(x,y);
				showResult(result1);
				break;
			case 3:
				System.out.print("\n\nPlease enter numbers to multiply: ");
				x = kbd.nextInt();
				y = kbd.nextInt(); 
				result1 = multiply(x,y);
				showResult(result1);
				break;
			case 4:
				System.out.print("\n\nPlease enter numbers to divide (divisor first then dividend): ");
				x = kbd.nextInt();
				y = kbd.nextInt(); 
				result1 = divide(x,y);
				showResult(result1);
				break;
			case 5:
				System.out.print("\n\nPlease enter any number above 0: ");
				s = kbd.nextDouble();
				result2 = squareRoot(s);
				showResult(result2);
				break;
			case 6:
				System.out.print("\n\nPlease enter decimal numbers to add: ");
				r = kbd.nextDouble();
				s = kbd.nextDouble();
				result2 = add(r,s);
				showResult(result2);
				break;
			case 7:
				System.out.print("\n\nPlease enter decimal numbers to subtract: ");
				r = kbd.nextDouble();
				s = kbd.nextDouble();
				result2 = subtract(r,s);
				showResult(result2);
				break;
			case 8:
				System.out.print("\n\nPlease enter decimal numbers to multiply: ");
				r = kbd.nextDouble();
				s = kbd.nextDouble();
				result2 = multiply(r,s);
				showResult(result2);
				break;
			case 9:
				System.out.print("\n\nPlease enter decimal numbers to divide (divisor first then dividend): ");
				r = kbd.nextDouble();
				s = kbd.nextDouble();
				result2 = divide(r,s);
				showResult(result2);
				break;
			default:  
				System.out.println("Please enter 1-9 for operations.");
				option = kbd.nextInt();
		}
	}
	
}