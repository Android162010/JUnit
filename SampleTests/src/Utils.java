
public class Utils { 
	int testNumber1;
	int testNumber2;
	int []vec;
	
	public Utils(int fIn,int sIn){
		 testNumber1= fIn;
		 testNumber2= sIn;
		
	}
	
	// Takes and array of numbers and gives their sum
	public static int sum(int[] vec)
	{
		int total = 0;
				for (int i=0;i< vec.length; i++){
					total += vec[i];
				}
				return total;
	}
	//Takes an array of numbers and gives their product
	public static int multiply(int[] vec)
	{
		int total =1 ;
				for (int i=0;i< vec.length; i++){
					total *= vec[i];
				}
				return total;
	}
	
	//Takes only 2 numbers and gives quotionets
	public  double divide ()
	{
	double quotient = testNumber1/testNumber2 ;
	return quotient ;
	}
	
	//Returns the number being divided as a string
	public String toString ()
	{
		double quotientForString  =testNumber1/testNumber2;
		return Double.toString(quotientForString);
		

	}
	public void divideByZero() {
		int zero= 0;
		int result= 8/zero;
	}
	
	public int[] createArray() {
		int[] temp = {1,3,5,7};
		return temp;
		
	}


}
