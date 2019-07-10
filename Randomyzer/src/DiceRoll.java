/* Takes numbers 1-6 and prints it out. Just like a dice roll.
 * @TylerTucker
*/

import java.util.Random;

public class DiceRoll {

	public String Result() {
		
    Random rand = new Random();

    int n = rand.nextInt(6);

    n += 1;
		
		return "Your Dice Roll is: " + n;
	}
}