package p2_inheritance;


public class Bird extends Animal {

	public Bird(int age,String gender) {
		super(age,gender);
		System.out.println("bird created with age "+this.age+" and gender "+this.gender);
	}
	
	public void Fly() {
		//this.animal_special=0;  --Child cannot reach private variables of parent--
		this.canFly=true;       //--Child can reach protected variables of parent-- 
		System.out.println("bird flying..");
	}
	
	
	public void BirdDie() {
		
		Die("Bird");  //--Child can reach protected variables of parent-- 
		
	}
	
	
	
	
}
