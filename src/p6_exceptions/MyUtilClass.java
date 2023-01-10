package p6_exceptions;

public class MyUtilClass {

	public static int Substract_10(int number) throws Exception{
		
		if(number<10) {
			throw new Exception("The number cannot be less than 10");
		}
		return number-10;
	}
	
	
	// You can invoke your own exceptions
	public static int Substract_20(int number) throws MyExceptions{
		
		if(number<20) {
			throw new MyExceptions("The number cannot be less than 20");
		}	
		return number-10;
		
		
	}
	
	
	
}
