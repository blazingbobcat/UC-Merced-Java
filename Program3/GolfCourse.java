/*Josh Klipstein -- Lab section 005
 * 
 * This program is used for a 9-hole gold course (they're usually 18 holes).
 * It reads number of players per game, their handicap and their raw score for each of the 9
 * holes.  It then prints their total raw score, their final score after handicap is calculated
 * in, and how many points under par they have.  The program then declares the winner and ends.
 * The winner is the player with the LOWEST final score.
 */
import java.util.*;
public class GolfCourse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in1 = new Scanner(System.in);
		int players;
		int[] handicap = new int[players];
		int[] scores = new int[9];
		int[] rawScore = new int[players];
		int[] finalScore = new int[players];
		int icount;
		String underPar;
		int minimumScore;
		GolfCourse.directions();
		System.out.println("");
		System.out.println("Enter how many players: ");
		players = in1.nextInt();
		for (icount = 0; icount <= players; icount++) {
			System.out.println("Please enter handicap for player " + icount);
			handicap[icount] = in1.nextInt();
			GolfCourse.fillScores(scores);
			rawScore[icount] = calcRawScore(scores);
			finalScore[icount] = rawScore[icount] - handicap[icount];
			if (finalScore[icount] <= 27) {
				underPar = "Yes";
			} else {
				underPar = "No";
			}
			if (minimumScore > finalScore[icount]) {
				minimumScore = finalScore[icount]);
			}	
			System.out.print("\nPlayer: " + icount + " \tHandicap: " + handicap[icount] 
			+ " \tScores: " + GolfCourse.printScores(scores) + " \tRaw Score:" + rawScore[icount] +
			 " \tHandicapped Score: " + finalScore[icount] + " \tUnder Par: " + underPar); 
		}
		for (icount = 0; icount <= players; icount++) {
			if (finalScore[icount] == minimumScore) {
				System.out.println("Player " + icount + " wins with a handicapped score of " + minimumScore);
			}
			else { continue }
		}
		
	}//end main
	
	public static void directions() {
		System.out.println("Welcome to UC Merced golf course.  This program will automatically");
		System.out.println("Determine the winner of a game by the number of players, raw scores");
		System.out.println("and handicaps entered.  Please enter an integer number above zero for");
		System.out.println("each value.");
		System.out.println("");
		System.out.println("Tip:  Did you know a golf course was originally to be built right where the campus is?");
		
	
	}//end directions
	
	public static void fillScores(int[] score) {
		int count;
		Scanner in1 = new Scanner(System.in);
		System.out.println("Please enter scores for this player: ");
		for (count = 0; count < 9; count++) {
			score[count] = in1.nextInt();
			if (score[count] < 1) {
				System.out.print("\n\nPlease enter a value above zero.");
				return fillScores(score[]);
			}
		}
	}//end fillScores
	
	public static int calcRawScore(int[] scores) {
		int sum;
		int count = 1;
		do {
			sum = scores[count] + scores[count-1];
		} while (count < 9);
		return sum;
	}//end CalcRawScore 
	
	public static void printScores(int[] printedScores) {
		int counter;
		for (counter = 0; count < 9; counter++) {
			System.out.print(printedScores[counter]);
		}
	}//end printScores
			
}//end Program
