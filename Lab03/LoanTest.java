/*This program serves as a test driver for the class Loan.*/
public class LoanTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double paymentAmount;
		
		Loan myLoan = new Loan();
		Loan myOtherLoan = new Loan();
		
			
		//myLoan.set(1234, 10000.00, 5.0, 60);

		paymentAmount = myLoan.payment();
		
		System.out.println("This is my loan: ");
		myLoan.display();
		System.out.println(" and my monthly payment will be "+ paymentAmount);
		
		if (myLoan.equals(myOtherLoan) == true)
			System.out.println("My loan is the same as before.");
		else
			System.out.println("My loan is not the same as before.");

	}

}
