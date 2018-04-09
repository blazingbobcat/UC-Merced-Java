//Josh Klipstein -- Lab Section 003
//21 September 2007
import java.util.Scanner;

public class Lab033 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double yourNum;
		
		System.out.println("Please enter a number:");
		yourNum = input.nextInt();
		if (yourNum <= 5000) {
		if (yourNum == 7) {
		System.out.println("Hey! That's lucky number seven!");
		System.out.println("Under");
		} else {
		System.out.println("The number you entered is " + yourNum);
		System.out.println("Under"); }
		} else if (yourNum > 5000) {
		System.out.println("The number you entered is " + yourNum);
		System.out.println("Over");
		 }
/* When a large number 50000000000 was entered, as well as -100000000 
an exception was produced. The number is not within the integer memory 
range of -32768 to 32767.  When 12,345 was used, the program output
"The number you entered is 12345."  This is because 12,345 is still an
integer within the integer memory range.  When a double value 789.543 was
entered, another exception was produced because of the decimal point.  Even if
we declare yourNum to be a double, the program still produces an exception when putting
in a decimal.  This is because of the line "yourNum = input.nextInt". */
	}

}

