/* Takes numbers 0-1 and assigns heads or tails to it
 * Prints out the info to the user
 * Offers to quit or restart
 * @TylerTucker
*/

import java.util.Random;

public class CoinFlip {

	public static void main(String[] args) {
		
    Random rand = new Random();

    int n = rand.nextInt(2);

    String output = "default error";

    switch(n)
{
   case 0 :
      output = "Heads";
      break;
   
   case 1 :
      output = "Tails";
      break;
   
   default : 
      output = "Random Error";
}

		System.out.print("Coin Flip: " + output);
	}
}


/* Alternate Option

import java.util.Random;

public class CoinFlip {

	public static void main(String[] args) {
		
    Random rand = new Random();

    int n = rand.nextInt(99);

    String output = "error";

    if (n >= 0 && n < 50) {
      output = "Heads";
    }
    else {
      output = "Tails";
    }

		System.out.print("Coin Flip: " + output);
	}
}
*/