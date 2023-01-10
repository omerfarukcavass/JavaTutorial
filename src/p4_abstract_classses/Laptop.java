package p4_abstract_classses;

public class Laptop extends Device{

	int laptop_special_id;
	
	public Laptop(int device_id) {
		super(device_id);
		// TODO Auto-generated constructor stub
	}

	public void runDevice() {
		System.out.println("Laptop with id:"+device_id+" running...");
	}

	
}
