/* Takes numbers 1-6 and prints it out. Just like a dice roll.
*/

// extends base number
public class DiceRoll extends BaseNumber{

	public String Result() {

// new instance of range
		BaseNumber range = new BaseNumber();

// set up number 1-6 for the roll
	    int n = range.rand(6);

    n += 1;

// return dice roll
		return "Your Dice Roll is: " + n;
	}
}
