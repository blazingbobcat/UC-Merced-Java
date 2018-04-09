import java.util.Scanner;
public class CalculatorOptionsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exit;
		Calculator c = new Calculator();
		Scanner kbd = new Scanner(System.in);
		
		do {
			System.out.println("Running Calculator program...");
			c.showOptions();
			System.out.println("\nPlease enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division or 5 for square root ");
			System.out.println("of integers.  Press 6 - 9 to add, subtract, multiply or divide decimal numbers.");
			int option;
			option = kbd.nextInt();
			c.doOperation(option);
			System.out.println("\nWould you like to do another operation (0 for no or any other number for yes)? ");
			exit = kbd.nextInt();
		} while (exit != 0);	
	}

}
