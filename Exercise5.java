import java.util.*;
public class Exercise5{
	public static void main(String []args){
		// set up variables
		Scanner input = new Scanner(System.in);
		double x = 1.1;
		double y = 1.1;

		// ask for x and y, and check if it is an integer
		do {
			System.out.print("Please enter an integer value for X: ");
			x = input.nextDouble();
		} while (x != Math.round(x));
		
		do {
			System.out.print("Please enter an integer value for Y: ");
			y = input.nextDouble();
		} while (y != Math.round(y));
		

		// calculate sum, difference, quotient, product, and remainder of x and y
		double sum = x + y;
		double difference = x - y;
		double quotient = x / y;
		double product = x * y;
		double remainder = x % y;

		// output results
		System.out.println("Sum of x and y: " + sum);
		System.out.println("Subtraction of x and y: " + difference);
		System.out.println("Division of x and y: " + quotient);
		System.out.println("Multiplication of x and y: " + product);
		System.out.println("Remainder of x and y: " + remainder);

		input.close();
}
}
