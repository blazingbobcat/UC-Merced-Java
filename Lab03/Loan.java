import java.util.*;


public class Loan {
	private int id;  // assume an unique integer between 1111-9999
	private double amount;  // $ amount of the loan
	private double rate;  // annual interest rate, such as 12.5 for 12.5% yearly
	private int term;  // number of months, length of the loan
	
    public Loan( )  // The default constructor
    { 
    	Scanner kbd = new Scanner(System.in);
    	System.out.println("Please enter ID #: ");
    	id = kbd.nextInt();
    	System.out.println("Please enter loan amount: ");
    	amount = kbd.nextDouble();
    	System.out.println("Please enter interest rate: ");
    	rate = kbd.nextDouble();
    	System.out.println("Please enter term (in months): ");
    	term = kbd.nextInt();
    	System.out.println("Thank You.");
    	

    }

   /* public void set(int newID, double newAmount, double newRate, int newTerm) 
    {
    	// This function simply places the parameter values in the appropriate member functions
    	// no need for error checking
    	this.id = newID;
    	this.amount = newAmount;
    	this.rate = newRate;
    	this.term = newTerm;

    }*/
    
    public double payment( ) 
    {
    	// Calculate the monthly payment
    	// precondition: all instance variables have been given values
    	// postcondition: monthly payment, based on instance vars, is returned
        // convert % yearly rate to monthly fraction
        
    	double converted_rate = rate / 1200.0;
    	double monthly;
        
    	monthly = amount * converted_rate * 
        		(Math.pow(converted_rate+1, term))/(Math.pow(converted_rate+1, term) -1);
        
    	return monthly;

    }
    
     public void display( ) 
    {
    	// print out the loan information in a nice format
    	System.out.println("My loan ID #: " + id);
    	System.out.println("My loan amount: $" + amount);
    	System.out.println("My interest rate: " + rate + "%");
    	System.out.println("My loan term: " + term + " months");

    }
    
    public boolean equals(Loan obj)
    {
    	//Check whether two loan amounts are the same or not.
    	if (id == obj.id)
    		if (amount == obj.amount)
    			if (rate == obj.rate)
    				if (term == obj.term)
    					return true;
					else
						return false;
				else
					return false;
			else
				return false;
		else
			return false;
	}


}
