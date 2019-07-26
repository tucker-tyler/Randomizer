/* Takes numbers 0-1 and assigns heads or tails to it
 * Prints out the info to the user
 * Offers to quit or restart
*/
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

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
    /* switch (random number): case 0 = heads, case 1 = tails */
    switch(n)
{
   case 0 :
	// write result to file with try and catch
		PrintWriter writer;
		try {
			writer = new PrintWriter("output.txt");
			writer.println("Heads");
		  	writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("error writing file");
		}
      break;
   
   case 1 :
	// write result to file with try and catch
		PrintWriter writer1;
		try {
			writer1 = new PrintWriter("output.txt");
			writer1.println("Tails");
		  	writer1.close();
		} catch (FileNotFoundException e) {
			System.out.println("error");
		}
      break;
   
   default :
}
  //Read result from file with try and catch        
    File file = 
		      new File("output.txt"); 
	String result = null;
	try {
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) 
		result = scanner.nextLine(); 
		scanner.close();
	} catch (FileNotFoundException e1) {
		System.out.println("file not found");
	} 
// return coin flip result
	return "Coin Flip: " + result;
	}

	
}
	
