/* Josh Klipstein -- Lab section 005

	This program takes in gas prices for a number of cities and each of these cities names
and then calculates the average of all prices.  Finally, it displays of list of the cities
entered with their respective gas prices and the average "national" gas price */
import java.util.*;

public class AverageGasPrice
{
	public static void main(String[] args)
	{
		double[] gasPrice = new double[25];
		String[] cityWhere = new String[25];
		int priceCount = 0;
		double price = 0;
		int cityCount = 0;
		String city;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program calculates and displays the average");
		System.out.println("price of a regular gallon of gas."); 

		System.out.println("Enter the price of gas or -99 to Quit: ");
		price = keyboard.nextDouble();
		
		while(price != -99)
		{
			gasPrice[priceCount] = price;
			priceCount++;
			price = keyboard.nextDouble();
		}
		
		System.out.println("Enter each city where these prices of gas are observed: ");
			city = keyboard.next();
			
		while (cityCount < priceCount) 
		{
			cityWhere[cityCount] = city;
			cityCount++;
			city = keyboard.next();
		}

		//Compute the average
		double sum = 0;

		for(int i=0; i < priceCount; i++)
		{
			sum = sum + gasPrice[i];
		}

		double average = sum/priceCount;
		System.out.println("Here is a list of cities you entered with their respective gas prices: ");
		for (int j=0; j < cityCount; j++) {
			System.out.println("City: " + cityWhere[j] + " \tGas price: " + gasPrice[j]);
		}

		System.out.print("\n\nThe average price per gallon of regular");
		System.out.println(" gas is " + average);

	}
}