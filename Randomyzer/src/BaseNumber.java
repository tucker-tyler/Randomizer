// imports java random class

import java.util.Random;

// establishes parent class
 	class BaseNumber {
 	
// set up variables for use
	static protected int range = 1;
	static protected int num = 1;
	Random rand = new Random();

	/*Constructor for GeometricObject class with Arguments*/
	
	public BaseNumber()
	{
		
	// establishes range variable
       int num = rand.nextInt(range);
	    BaseNumber.num = num;
	    
	}
// range object creation
	public int rand(int range)
	{
	BaseNumber.range = range;
	int num = rand.nextInt(range);
    return num;
    
	}
	public void SetRange(int range) {
		BaseNumber.range = range;
	}
	
	/*Method to output color and filled values to console*/
	public String Output()
		{
			return Integer.toString(num);
		}

}
