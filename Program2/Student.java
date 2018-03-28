/*Josh Klipstein -- Lab Section 005
 * This program calculates letter grades for a specific class
 * by taking in 2 quiz scores, a midterm score and final score
 * for a specific student with a weighted grade point average.
 * It then outputs all test scores, final percentage and the 
 * letter grade given to the student.  I hope I get 100% on this
 * program and an A in this class, Milostan.
 */
import java.util.Scanner;
public class Student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double quizScoreOne;
		double quizScoreTwo;
		double midtermScore;
		double finalScore;
		double weightedAverage;
		char letterGrade;
		int menuValue;
		Scanner kbd = new Scanner(System.in);
		Student.directions();
		menuValue = Student.menu();
		if (menuValue == 0) {
			System.out.println("Goodbye.");
		} else
			if (menuValue == 1) {
				System.out.print("\n\nOkay.  Please enter quiz 1 score (out of 10 points): ");
				quizScoreOne = kbd.nextDouble();
				System.out.print("\nEnter quiz 2 score (out of 10 points): ");
				quizScoreTwo = kbd.nextDouble();
				System.out.println("Enter midterm score (out of 100 points): ");
				midtermScore = kbd.nextDouble();
				System.out.println("Finally, enter final exam score (out of 100 points): ");
				finalScore = kbd.nextDouble();
				System.out.print("Thank you.");
				weightedAverage = Student.calcAverage(quizScoreOne, quizScoreTwo, midtermScore, finalScore);
				letterGrade = Student.assignFinalGrade(weightedAverage);
				System.out.println("");
				System.out.println("Here is the student's transcript for this course: ");
				System.out.print("\n\nQuiz One score: " + quizScoreOne + "/10 points. \nQuiz Two score: "
						+ quizScoreTwo + "/10 points. \nMidterm Score: " + midtermScore + "/100 points. \nFinal Exam Score: "
						+ finalScore + "/100 points. \nWeighted Average: " + weightedAverage + "\nFinal Grade: " + letterGrade
						+ "\n\nThank you for using this program.");
		}
	}//end main()
	
	public static void directions() {
		System.out.println("Welcome to the CSE20 grading system." +
				"\nThis program takes both quiz scores, the midterm score and final exam score");
		System.out.println("then takes the average of these scores.  It will then weigh the average and");
		System.out.println("provide a letter grade.");
		System.out.println("\n\nPlease enter a value of zero or over for each score.");
		System.out.println("\n\nWelcome to the main menu.  Select an option with the corresponding number."
				+ "\n0. Exit\n1. Enter Student Grades.");
	}//end directions()
	
	public static int menu() {
		int selectOpt;
		Scanner kbd = new Scanner(System.in);
		selectOpt = kbd.nextInt();
		if (selectOpt == 0) {
			return selectOpt;
		} else if (selectOpt == 1) {
			return selectOpt;
		} else {  
			System.out.println("");
			System.out.println("Please enter 1 to enter grades or 0 to quit.");
			return Student.menu();
		}
	}//end menu
	
	public static double calcAverage(double quizOne, double quizTwo, double midterm, double finalExam) {
		double average;
		average = (.25 * ((quizOne + quizTwo) / 20)) + (.25 * (midterm / 100)) + (.50 * (finalExam / 100));
		return average;
	}//end calcAverage
	
	public static char assignFinalGrade(double average) {
		char grade = 'A';
		if (average >= .90) {
			grade = 'A';
		} else if (average >= .80 & average < .90) {
			grade = 'B';
		} else if (average >= .70 & average < .80) {
			grade = 'C';
		} else if (average >= .60 & average < .70) {
			grade = 'D';
		} else if (average < .60) {
			grade = 'F';
		} 
		return grade;
	}
}//end program

