import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/* Takes in parameters for numbers to find a random number between
 * Finds the random number and prints it to the user
 * Offers the option to quit back to the menu or try again
*/

// extend base number

public class RandomNumber extends BaseNumber{

	public String Result() {
		
		// Scanner in = new Scanner(System.in);
          
		// System.out.print("Please enter your number range, "
		// 		+ "separated by the enter key");
		
		// int number_one = in.next();
		
		// int number_two = in.next();
		
		// int random_number_output;

// object instance for range

	BaseNumber range = new BaseNumber();

// random number 1-100
    int n = range.rand(100);

    n += 1;

    // write result to file with try and catch
    PrintWriter writer1;
	try {
		writer1 = new PrintWriter("output.txt");
		writer1.println("Your random number is: " + n);
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
    
    
    
// return random number result
		return result;
	}
}