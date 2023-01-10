package p1_java_basics;

import p2_inheritance.Example;

public class Functions {

	/* Method signature: public static void main(String[] args)
	 * Method body:      what is inside this method.
	 */
	
	public static void main(String[] args) {
	
		printSomething(5);
		printSomething("five");
		
		MyUtils.printSomethingFromUtils(5);
		MyUtils.printSomethingFromUtils("five");
		
		MyUtils.sumTwoNumbers(3, 5);
		
		int returnedNumber=MyUtils.add10(99);
		System.out.println(returnedNumber);
		
		Example.PrintExample();
		
		
		
	}

	public static void printSomething(int x) {
		System.out.println("Hello "+x);
	}
	
	public static void printSomething(String x) {
		System.out.println("hello "+x);
	}
	
	public static void StaticMethod() {
		System.out.println("This can be called by class reference.");
	}
	
	public void nonStaticMethod() {
		System.out.println("This type of methods cannot called by class reference.You should be called by creating its instance.");
	}
	
	
}
