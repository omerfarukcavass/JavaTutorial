package p4_abstract_classses;

public class SmartPhone extends Device{

	public SmartPhone(int device_id) {
		super(device_id);
		
	}

	public void runDevice() {
		System.out.println("Smartphone with id:" +device_id+ " running..");
		
	}

	
	
}
