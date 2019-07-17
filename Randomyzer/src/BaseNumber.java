import java.util.Random;


 	class BaseNumber {
 		
	static protected int range = 1;
	static protected int num = 1;
	Random rand = new Random();

	/*Constructor for GeometricObject class with Arguments*/
	
	public BaseNumber()
	{
		
	    int num = rand.nextInt(range);
	    BaseNumber.num = num;
	    
	}
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
