//Josh Klipstein -- Lab Section 1
/*  This program matches two people to be room mates at a university dorms.  The premise
 * is to match same genders, same interests (based on a scale of 1 to 10. 1 being the person
 * does not like the activity at all and 10 being the person totally likes the activity), and
 * and same age.  If neither of them are the same gender, the match index is zero.  The match
 * score is determined by 30 minus the interest scores divided by thirty plus 10 minus the
 * age difference divided by 10 all times 5.  Neither person may be more than ten years older
 * than each other or the match score will be zero.  
 */
import java.util.*;
public class Match {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ageDifference;
		double interestScore;
		double rawMatchScore;
		double matchScore = 0.;
		boolean genderMatch;
		int doAgain = 1;
		Person p1 = new Person();
		Person p2 = new Person();
		Scanner kbd = new Scanner(System.in);
		
		while (doAgain == 1) {
			p1.input();
			p2.input();
			
			if (p1.getGender() != p2.getGender())
				genderMatch = false;
			else
				genderMatch = true;
			ageDifference = Math.abs(p1.getAge(p1) - p2.getAge(p2));
			interestScore = Math.abs(p1.getQuietTime() - p2.getQuietTime()) + 
				Math.abs(p1.getMusic() - p2.getMusic()) + Math.abs(p1.getReading() - 
						p2.getReading());
			
			//Match Score calculation
			if (genderMatch == false)
				matchScore = 0.;
			else if (genderMatch == true)
				if (ageDifference <= 10) {
					rawMatchScore = ((30. - interestScore) / 30.) + 
						((10. - ageDifference) / 10.);
					matchScore = rawMatchScore * 5;
				} else if (ageDifference > 10) {
					matchScore = 0.; }
			
			//Now we call the output function to show all results.
			Person.output(matchScore, p1.getAge(p1), p2.getAge(p2), p1.getQuietTime(), 
					p2.getQuietTime(), p1.getReading(), p2.getReading(), p1.getMusic(), 
					p2.getMusic(), p1.getName(), p2.getName());
			System.out.print("Would you like to match another pair (1 for yes, any " +
					"other number for no)? ");
			doAgain = kbd.nextInt();
		}
	}

}
