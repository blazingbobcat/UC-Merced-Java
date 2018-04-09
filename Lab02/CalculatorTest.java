public class CalculatorTest
{
	public static void main(String[] args)
	{
		int num1 = 25;
		int num2 = 5;
		Calculator c = new Calculator();

		System.out.println("Testing Calculator class......\n\n");
		System.out.println("\tx=25, y=5\n");
		c.showResult(c.add(num1,num2));
		c.showResult(c.subtract(num1, num2));
		c.showResult(c.multiply(num1, num2));
		c.showResult(c.divide(num1,num2));
	}
}