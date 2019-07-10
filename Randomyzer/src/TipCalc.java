/* Takes the input of what percent tip and what the bill costs
 * Prints out the info to the user
 * Offers to quit or restart
 * @TylerTucker
*/

import java.util.Scanner;

public class TipCalc {

	
	public String Result() {
		
		
		double tip_amount;
		
		double total_amount;
		
		Scanner input = new Scanner(System.in);
        
		System.out.print("Please enter the meal amount ");
				
				double meal_amount = input.nextDouble();
				
		System.out.print("Please enter the tip percentage ");
				
				double tip_percentage = input.nextDouble();
				
				double tip_adjusted = tip_percentage / 100;
				
		tip_amount = meal_amount * tip_adjusted;
		
		total_amount = meal_amount + tip_amount;
		input.close();
		return "Tip: $" + tip_amount + "\nTotal: $" + total_amount;
		
		
	}
}