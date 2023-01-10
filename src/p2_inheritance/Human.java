package p2_inheritance;

public class Human {

	// All variables are public by default
	String name;
	int age;
	float height;
	boolean male;
	
	public Human() {
		System.out.println("Human created.");
	}
	
	public Human(String name_,int age_) {
		name=name_;
		age=age_;
		System.out.println("Human "+name+" created.");
		
	}
	
	// Right click-> source -> generate constructor using fields
	public Human(String name, int age, float height, boolean male) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.male = male;
	}

	
	
	
	public void Speak() {
		System.out.println("My name is "+ name);
		System.out.println("My age is "+ age);
	}
	
	public void Sleep() {
		System.out.println("Sleeping...");
	}
	
	
	
}
