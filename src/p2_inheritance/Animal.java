package p2_inheritance;

public class Animal {

	int age;  //package-private (default)
	public String gender; // can be reached outside package
	private int animal_special; // only this class can reach
	protected boolean canFly;
	
	public Animal() {
		System.out.println("animal created ");
	}

	
	public Animal(int age,String gender) {
		this.age=age;
		this.gender=gender;
		
		System.out.println("animal created with age "+this.age+" and gender "+this.gender);
	}
	
	
	public void Sleep() {
		System.out.println("Sleeping...");
	}
	
	
	public void Eat() {
		System.out.println("Eating..");
	}
	
	// Protected methods can be reached by child class
	protected void Die(String name) {
		
		System.out.println(name+" died.");
		
	}
	

	
	
}
