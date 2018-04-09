//Josh Klipstein,  Lab Section 001, 5 February 2008
public class Clock
{
	//Instance variables
	private int hours;
	private int minutes;
	private int seconds;
	private boolean displaySeconds;

	//Class Methods
	public void setHour(int hour)
	{
		hours = hour;
	}

	public void setMinutes(int min)
	{
		minutes = min;
	}

	public void setSeconds(int sec)
	{
		seconds = sec;
	}
	
	public void getHour() {
	}
	
	public void getMinutes() {
	}
	
	public void getSeconds() {
	}
	
	public void setDisplaySeconds(boolean displaySeconds) {
		displaySeconds = showSeconds(); 
	}
	
	public boolean showSeconds() {
		return false;
	}
	 
	public void displayTime() {
	//This method displays the time.
		if (displaySeconds == true) {
			System.out.println(hours + ":" + minutes + ":" + seconds);
		} else {
			System.out.println(hours + ":" + minutes);
		}
	}
}