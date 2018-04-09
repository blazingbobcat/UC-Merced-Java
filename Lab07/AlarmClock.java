//Josh Klipstein -- Lab Section 1
/* This is the alarm clock class.  It has three instance variables that represent hours,
minutes and seconds and accessor methods for these variables. */ 
public class AlarmClock extends Clock {
	private int hours;
	private int minutes;
	private int seconds;
	
	public void setHours(int h) {
		hours = h;
	}
	
	public void setMinutes(int m) {
		minutes = m;
	}
	
	public void setSeconds(int s) {
		seconds = s;
	}
	
	public int getHours( ) {
		return hours;
	}
	
	public int getMinutes( ) {
		return minutes;
	}
	
	public int getSeconds( ) {
		return seconds;
	}
	
	public String toString(int hour, int minute, int second) {
		return ("The alarm clock is set to: " + hour + ":" + minute + ":" + second);
	}

}
