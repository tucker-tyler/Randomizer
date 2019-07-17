/* Creates a menu
 * Prints out the info to the user
 * 
 * @TylerTucker
*/
import java.util.*;

public class Menu {

  public static void main(String[] args) {
	  
	  boolean continueInput = true;
	  int[] array = new int[6];
	  int i = 0;
	  for (i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
	 
	  System.out.println(
		        "Select an option: \n" +
		        "  1) Flip a coin\n" +
		        "  2) Roll a dice\n" +
		        "  3) Get a number 1-100 \n" +
		        "  4) Tip Calculator\n" +
		        "  5) Random Card in a Deck\n" +
		        "  6) Quit \n" );
	  
	 
		
		do {
			 Scanner in = new Scanner(System.in);
			 int option = in.nextInt() - 1;
			
			//try used so that we can use the catch feature
			try {
				
				
				
				//store user input as index
				
				if (array[option] == 1) {
					CoinFlip coinflip = new CoinFlip(option);
					System.out.println("" + coinflip.Result());
				}
				if (array[option] == 2) {
					DiceRoll diceroll = new DiceRoll();
					System.out.println("" + diceroll.Result());
				}
				if (array[option] == 3) {
					RandomNumber randomnum = new RandomNumber();
					System.out.println("" + randomnum.Result());
				}
				if (array[option] == 4) {
					TipCalc tipcalc = new TipCalc();
					System.out.println("" + tipcalc.Result());
					in.close();
					continueInput = false;
				}
				if (array[option] == 5) {
					RandomCard randomcard = new RandomCard();
					System.out.println("" + randomcard.Result());
				}
				if (array[option] == 6 ) {
					
					System.out.println("Closing");
					in.close();
					continueInput = false;
				}
				
				} 
			
			//If input is not an integer display error message
			catch (ArrayIndexOutOfBoundsException ex) {
				
				//display error message
				System.out.println("Enter a value between 1 and 6");
				
				//prompt again
				in.nextLine();
			}
			
			catch (InputMismatchException ex) {
				
				//display error message
				System.out.println("Number was not an integer, please try again");
				
				//prompt again
				in.nextLine();
				}
			
			
			
			
			
			
		}
		//prompt again
		while (continueInput);
		
		
	}
}