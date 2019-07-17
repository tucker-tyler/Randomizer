/* Takes numbers 1-6 and prints it out. Just like a dice roll.
*/

public class DiceRoll extends BaseNumber{

	public String Result() {
		
		BaseNumber range = new BaseNumber();
	    int n = range.rand(6);

    n += 1;
		
		return "Your Dice Roll is: " + n;
	}
}
