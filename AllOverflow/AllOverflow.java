//Josh Klipstein Lab section 003
public class AllOverflow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Declare variables
int i1 = 2147483647, i2 = 1, i3;
byte b1 = Byte.MAX_VALUE, b2 = 1, b3;
long l1 = Long.MAX_VALUE, l2 = 1, l3;
short s1 = Short.MAX_VALUE, s2 = 1, s3;
float f1 = Float.MAX_VALUE, f2 = 1, f3 ;
double d1 = Double.MAX_VALUE, d2 = 1.0E308, d3;

//Calculate and display i3, the overflowing integer value
	//First, print out the values before the overflow
	System.out.println("Maximum Integer value: " + i1);
	System.out.println("Let's add: " + i2);
	//compute i3 and then print
	i3 = i1 + i2;
	System.out.println("Overflow!  We get: " + i3);
	System.out.println("");
	
	//Print maximum byte value, add b2 and print b3
	System.out.println("Maximum byte value: " + b1);
	System.out.println("Let's add: " + b2);
	b3 = (byte)(b1 + b2);
	System.out.println("Overflow!  We get: " + b3);
	System.out.println("");
	
	//Print maximum short value, add s2 and print s3
	System.out.println("Maximum short value: " + s1);
	System.out.println("Let's add: " + s2);
	s3 = (short)(s1 + s2);
	System.out.println("Overflow!  We get: " + s3);
	System.out.println("");
	
	//Print maximum long value, add l2 and print l3
	System.out.println("Maximum long value: " + l1);
	System.out.println("Let's add: " + l2);
	l3 = l1 + l2;
	System.out.println("Overflow!  We get: " + l3);
	System.out.println("");
	
	//Print maximum float value, add f2 and print f3
	System.out.println("Maximum float value: " + f1);
	System.out.println("Let's add: " + f2);
	f3 = (float)(f1 + f2);
	System.out.println("Overflow!  We get: " + f3);
	System.out.println("");
	
	//Print maximum double value, add d2 and print d3
	System.out.println("Maximum double value: " + d1);
	System.out.println("Let's add: " + d2);
	d3 = d1 + d2;
	System.out.println("Overflow!  We get: " + d3);
	
	
	
	}

}
