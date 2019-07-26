/* Takes numbers 1-6 and prints it out. Just like a dice roll.
 * @TylerTucker
*/

import java.util.Random;

public class DiceRoll {

	public static void main(String[] args) {
		
    Random rand = new Random();

    int n = rand.nextInt(5);

    n += 1;
		
		System.out.print("Your random number is: " + n);
	}
}