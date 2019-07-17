/* Takes numbers 0-1 and assigns heads or tails to it
 * Prints out the info to the user
 * Offers to quit or restart
*/

public class CoinFlip extends BaseNumber {

	public CoinFlip(int num) {
		super();
		// TODO Auto-generated constructor stub
	}

	public String Result() {
		
    BaseNumber range = new BaseNumber();
    int n = range.rand(2);
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

 	String result = "Coin Flip: " + output;
	return result;
	}

	
}
	
