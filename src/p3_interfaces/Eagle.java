package p3_interfaces;

import p2_inheritance.Bird;

public class Eagle extends Bird implements Flyable{ // first extends then implements

	/*
	 * A class can only have one parent class.
	 * It can implement more than one interface
	 */
	static int static_var=45;
	
	
	public Eagle(String gender,int age) {
		super(age,gender);
	}
	

	// all functions in interface must be filled
	public void FlyFun(){ 
		System.out.println("eagle can fly");
	
		
	}
	
	public void EagleFun() {
		System.out.println("asd");
	}
	
}
