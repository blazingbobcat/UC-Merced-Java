//Josh Klipstein, Lab Section 001, 5 February 2008
import java.util.*;

public class ClockTest
{
	public static void main(String[] args)
	{
		Clock myClock = new Clock();

		myClock.setHour(10);
		myClock.setMinutes(15);
		myClock.setSeconds(47);

		System.out.print("The time is ");
		myClock.setHour(3);
		myClock.getHour();
		myClock.getMinutes();
		myClock.getSeconds();
		myClock.displayTime();
	}
}