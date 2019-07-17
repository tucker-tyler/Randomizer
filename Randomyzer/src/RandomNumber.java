/* Takes in parameters for numbers to find a random number between
 * Finds the random number and prints it to the user
 * Offers the option to quit back to the menu or try again
 * @TylerTucker
*/



public class RandomNumber extends BaseNumber{

	public String Result() {
		
		// Scanner in = new Scanner(System.in);
          
		// System.out.print("Please enter your number range, "
		// 		+ "separated by the enter key");
		
		// int number_one = in.next();
		
		// int number_two = in.next();
		
		// int random_number_output;

	BaseNumber range = new BaseNumber();

    int n = range.rand(100);

    n += 1;
		
		return "Your random number is: " + n;
	}
}