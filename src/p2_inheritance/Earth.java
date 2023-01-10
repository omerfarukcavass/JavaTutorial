package p2_inheritance;

public class Earth {

	
	public static void main(String [] args) {
		
//		Human ali=new Human();
//		ali.Speak();
//		
//		ali.name="Ali";
//		ali.age=22;
//		ali.Speak();
//		
//		
//		Human veli=new Human("Veli",23);
//		veli.Speak();
//		
//		Animal animal=new Animal(3,"boncuk");
//		System.out.println(animal.age);
//		
//		Fish fish=new Fish(4,"boby");
//		System.out.println(fish.age);
		
		
//		Fish my_fish=new Fish(3,"female");
//		Bird my_bird=new Bird(5,"male");
//		
//		Animal my_animal=new Fish(2,"male");  // Reference with type Animal "can" hold Fish' address
//		//Fish my_fish1=new Animal(2,"male");  // Reference with type Fish "cannot" hold Animal' address
//		
//		my_fish.Eat();
//		my_bird.Sleep();
//		

		Fish my_fish2=new Fish(5,"male");
		my_fish2.FishDie();
		my_fish2.Die("asd"); //we can reach protected functions (both in child and parent) in the same package
		my_fish2.fish_protected_var=0; //we can reach protected variables (both in child and parent) in the same package
		my_fish2.Sleep(); //this calls Sleep function in Fish

		
		
	}
	
	
}
