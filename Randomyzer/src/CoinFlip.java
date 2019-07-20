/* Takes numbers 0-1 and assigns heads or tails to it
 * Prints out the info to the user
 * Offers to quit or restart
*/

// extend base number class
public class CoinFlip extends BaseNumber {

	public CoinFlip(int num) {
		super();
		// TODO Auto-generated constructor stub
	}

	public String Result() {
	
/* uses the range variable, creates instance */
    BaseNumber range = new BaseNumber();
    int n = range.rand(2);
    String output = "default error";

/* switch (random number): case 0 = heads, case 1 = tails */
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
// return coin flip result
 	String result = "Coin Flip: " + output;
	return result;
	}

	
}
	
