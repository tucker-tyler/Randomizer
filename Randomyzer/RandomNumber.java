/* Takes in parameters for numbers to find a random number between
 * Finds the random number and prints it to the user
 * Offers the option to quit back to the menu or try again
 * @TylerTucker
*/

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		// Scanner in = new Scanner(System.in);
          
		// System.out.print("Please enter your number range, "
		// 		+ "separated by the enter key");
		
		// int number_one = in.next();
		
		// int number_two = in.next();
		
		// int random_number_output;

    Random rand = new Random();

    int n = rand.nextInt(99);

    n += 1;
		
		System.out.print("Your random number is: " + n);
	}
}