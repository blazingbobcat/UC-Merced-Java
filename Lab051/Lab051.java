//Josh Klipstein Lab section 3
import java.util.Scanner;
public class Lab051 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		limit = sc.nextInt();
		System.out.println("");
		for (i = 0; i <= limit; i++) {
		System.out.print(i + "");
		}
		
		System.out.println("");
		i=0;
		for (i = limit; i >= 0; i--) {
		System.out.print(i + "");
		}
		
		i=limit;
		System.out.println("");
		while (i >= 0) {
		System.out.print(i + "");
		--i;
		}
		
		System.out.println("");
		i = 0;
		while (i <= limit) {
		System.out.print(i + "");
		if (i % 3 == 0) {
		i = i + 3;
		} else {
		break; }
		}
		
		i = 1;
		System.out.println("");
		while (i <= limit) {
		System.out.print(i + "");
		i = i * 2;
		}
		


	}

}
