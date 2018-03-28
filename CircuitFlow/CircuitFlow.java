/* Josh Klipstein
	Lab Section 3
	October 26, 2007

This program creates two arrays, current and voltage through a load, with lengths of 1000 and calculates power
at each sample.  Then it caluculates the average power for all 1000 samples. */
public class CircuitFlow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] v = new double [1000]; //Voltage
		double [] i = new double [1000]; //Current
		double [] p = new double [1000]; //Power
		double t = 0.;
		int count;
		
		for (count = 0; count < 1000; count++) { //fill in values for voltage
			t = t + .0001;
			v[count] = 17 * Math.sin(377 * t);
			}
		
		for (count = 0; count < 1000; count++) { //fill in values for current
			t = t + .0001;
			i[count] = 1.414 * Math.sin((377 * t) - (Math.PI/6));
			}
			
			System.out.println("Hello.  This program calulates power from voltage and current every .0001 seconds.");
			System.out.println("");
			System.out.println("Time\t Voltage\t\t Current\t\t Power");
			for (count = 0; count < 1000; count = count + 100) { //calculate power (Voltage * Current)
				p[count] = v[count] * i[count];
				t = count * .0001;
				System.out.println(t + "\t" + v[count] + "\t" + i[count] + "\t" + p[count]);
				}
				
			//Calculate average power
			double total = 0.0;
			double average = 0.0;
			for (count = 0; count < 1000; count++) {
				total = total + p[count];
			average = total / (count * .01); }
			System.out.println("The average power is: " + average + " Watts");
			System.out.println("Thank you for using this program."); 
			

	}

}
