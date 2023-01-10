package p3_interfaces;

public interface Flyable {


	/*
	 * Functions in parent classes should generalize all types of children.
	 * Not all birds can fly, so you shouldn't put fly function in bird class
	 * You can create an interface Flyable and only the birds that can fly can implement this interface.
	 */
	
	
	// Variables declared in interface are by default public, static and final
	int var_interface=0; 
	
	// abstract method
	public void FlyFun(); // no body of the function
	

	/*
	 * Interfaces are mostly used for functions 
	 * since all variables are public static final.
	 */
	
	
	
	
}
