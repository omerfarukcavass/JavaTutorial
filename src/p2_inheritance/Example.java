package p2_inheritance;

import p1_java_basics.Functions;

public class Example {

	public static void main(String[] arguments) {
		
		Functions.printSomething(5);
		//MyUtils.printSomethingFromUtils(5);
		
		Functions.StaticMethod();
		//Functions.nonStaticMethod;  --Not a static method --
		
		Functions myVar;     
		myVar=new Functions();
		myVar.nonStaticMethod();  // -- can be called via instances --
		
		
		myVar.StaticMethod();  // it runs but warns that you should use as class reference.
		
		
		
	}
	

	public static void PrintExample() {
		System.out.println("print example in other package: ");
		Functions.printSomething(100);
		
	}
	
	
}
