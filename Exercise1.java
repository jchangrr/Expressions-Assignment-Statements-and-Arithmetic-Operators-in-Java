import java.util.*;

public class Exercise1{
	public static void main(String []args){
		// Set up variables
		Scanner input = new Scanner(System.in);
		double x = 0;
		double y = 0;

		// Ask user for non-zero value for x and check
		do {
			System.out.print("Please enter a non-zero value for x: ");
			x = input.nextDouble();
		} while (x ==0);

		// Ask user for non-zero value for y and check
		do {
			System.out.print("Please enter a non-zero value for y: ");
			y = input.nextDouble();
		}  while (y == 0);
		

		//Calculate result of plugging x and y into formula
		double result = (3+4*x)/5 - 10*(y-5)/x + 9*(4/x + (9+x)/y);
		System.out.println("The end result is: " + result);

		input.close();
	}
}