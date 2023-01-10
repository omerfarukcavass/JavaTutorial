package p2_inheritance;

public class Fish extends Animal{
	
	protected int fish_protected_var;
	
	//   Rule: Each child class constructor must call one of parent constructors. 
	
	public Fish(int age,String gender) {
		// Firstly, default constructor in Animal is called automatically
		//super();    You can also call it but this will not change anything.(no double call!)
		
		this.age=age;
		this.gender=gender;
		
		System.out.println("fish created with age "+this.age+" and gender "+this.gender);
	}
	
	public Fish(int age,String gender,String name) {
		super(age,gender);
		System.out.println("fish created with age "+this.age+" and gender "+this.gender);
		
		
		
	}

	
	
	public void Swim() {
		System.out.println("swimming..");
	
	}

	
	public void FishDie() {
		
		Die("Fish");
		
	}
	
	// overriding Sleep function
	public void Sleep() {
		System.out.println("Fishes dont sleep too much.");
	}
	
	
	
	
	
	
	
}
