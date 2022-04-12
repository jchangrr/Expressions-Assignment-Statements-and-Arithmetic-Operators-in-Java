import java.util.*;
public class Exercise3 {
	public static void main(String []args) {
		// set up variables
		Scanner input = new Scanner(System.in);
		int choice = 3;
		double money = -1;

		// ask user how much money to convert
		do {
			System.out.print("Please enter the amount of money you wish to convert: ");
			money = input.nextDouble();
		} while (money < 0);
		

		// ask user to enter either 1 or 2
		do {
			System.out.print("Please enter either 1 or 2: ");
			choice = input.nextInt();
		} while (choice != 1 && choice != 2);
		

		// set up if/else statement for 1 or 2
		if (choice == 1) {
			double total = money * 0.9;
			System.out.printf("You entered in %.2f in Dollars based on the user and they are equals to %.2f Euros \n", money, total);
		}
		else if (choice == 2) {
			double total = money / 0.9;
			System.out.printf("You entered in %.2f in Euros based on the user and they are equals to %.2f Dollars \n", money, total);
		}
		input.close();
	}
}