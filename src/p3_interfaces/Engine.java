package p3_interfaces;

import p2_inheritance.Fish;

public class Engine {

	int engine_ver=0;
	
	public static void main(String[] args) {


		Fish fish=new Fish(8,"female");
		fish.FishDie();
		//fish.age=45;  default:package private
		fish.gender="sdas";
		//fish.Die("asd"); protected variables cannot be reached "outside package"
		
		Eagle eagle=new Eagle("asd",34);
		eagle.Fly(); 
		System.out.println(Eagle.var_interface);
		System.out.println(Flyable.var_interface);
		
		
		// Same as using parent class reference for children, we can also use interface reference.
		
		Flyable flyable_eagle=new Eagle("M",45);
		flyable_eagle.FlyFun();
		//flyable_eagle.EagleFun();  Similarly, Flyable reference can only see functions in flyable interface. 
		
	}
	
	public static void Deneme() {
		Eagle.static_var=0;
		// Eagle.var_interface=8;		cannot change final vars.can only initialize
		//engine_ver=34;  cannot use nonstatic variables in static methods
	}
	
	
	// A class can create instances of its type
	public Engine CreateNewEngine() {
		Engine engine=new Engine();
		return engine;

	}

	
}
