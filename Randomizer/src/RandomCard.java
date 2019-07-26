import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * RandomCard.java
 * -------------------
 * Displays the name of a card randomly chosen from a complete deck of 52 
 * playing cards.
 */

// extends base number class
 public class RandomCard extends BaseNumber{
    /* Instance Variables */

// sets up array for suits and card numbers/names
    public String Result(){
        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String cards[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace" };

// object instance for range 
        BaseNumber range = new BaseNumber();
        BaseNumber range2 = new BaseNumber();

// write result to file with try and catch
        PrintWriter writer1;
    	try {
    		writer1 = new PrintWriter("output.txt");
    		writer1.println(cards[range.rand(13)] + " of " +suits[range2.rand(4)]);
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
       return result;
    }
}