import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

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

 // write result to file with try and catch
    PrintWriter writer1;
	try {
		writer1 = new PrintWriter("output.txt");
		writer1.println(n);
	  	writer1.close();
	} catch (FileNotFoundException e) {
		System.out.println("error");
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
	//return result to user 
		return "Your Dice Roll is: " + result;
	}
}
