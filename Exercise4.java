import java.util.*;
public class Exercise4 {
	public static void main(String []args) {
		// set up variables
		Scanner input = new Scanner(System.in);

		// ask for desired grade and check
		System.out.print("Enter desired grade> ");
		String grade = input.next();

		// ask for minimum average required
		System.out.print("Enter minimum average required> ");
		double min_avg = input.nextDouble();

		// ask for current average in course
		System.out.print("Enter current average in course> ");
		double cur_avg = input.nextDouble();

		// ask how much the final counts as a percentage of the course grade
		System.out.print("Enter how much the final count as a percentage of the course grade> ");
		double perc = input.nextDouble() / 100;

		// calculate score needed
		double score_needed = (min_avg - (cur_avg * (1 - perc))) / perc;

		// give score needed
		System.out.printf("You need a score of %.1f on the final to get " + grade, score_needed);
		System.out.println();

		input.close();
	}
}