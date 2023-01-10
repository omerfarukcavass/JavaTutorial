package p4_abstract_classses;

public abstract class Device {

	/* Cannot create instances of abstract classes. Only inheritance is allowed.  
	 * If a class have an abstract class it must be an abstract class.
	 * All abstract methods must be filled in children.
	 */
	
	protected int device_id;
	int device_fee;
	
	
	public Device(int device_id) {
		this.device_id=device_id;
	}
	
	
	public int getId() {
		return device_id;
	}
	
	// abstract methods dont have body
	public abstract void runDevice();
	
	/*
	 * We can also make runDevice not abstract and give it empty body.
	 * In child classes, we can override this function.
	 * Instead of giving empty body, we make it abstract function.
	 * 
	 */
	
	public void notAbstractMethod() {
		
		System.out.println("not abstract method...");
		
	}
	
	
}
