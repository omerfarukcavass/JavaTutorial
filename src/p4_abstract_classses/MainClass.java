package p4_abstract_classses;



public class MainClass {

	public static void main(String[] args) {
		
		Laptop laptop=new Laptop(999);
		laptop.device_id=0;
		laptop.runDevice();

		SmartPhone s_phone=new SmartPhone(1000);
		s_phone.runDevice();
		
		Device laptop1=new Laptop(45);
		//laptop1.laptop_special_id=56;  cannot reach child class variables with parent reference!
		
		Laptop laptop2=new Laptop(77);
		laptop2.laptop_special_id=56;
		
		System.out.println("===========================");
		
		
		Device[] myDevices=new Device[]{s_phone,laptop,laptop1,laptop2};
		DeviceRun(myDevices);
		System.out.println("===========================");
		
	
		Device my_device=new Laptop(55);
		ChangeDeviceID(my_device, 99);
		System.out.println(my_device.device_id);
		
		
		Device my_second_device=GiveMyDevice(my_device);
		System.out.println(my_second_device.device_id);
		
		
		System.out.println("===========================");
		
		
	}
	
	/* Actually we can create runDevice method in both Smartphone and Laptop separately.
	 * But by defining runDevice in Device class, we can use Device as reference to call this function.


	 * Using parent class reference for child classes is called "Polymorphism".
	 * It enables your program to run more dynamic.
	 */
	
	
	public static void DeviceRun(Device[] devices) {
		
		for (Device device : devices) {
			device.runDevice();
		}
		
	}
	
	public static void ChangeDeviceID(Device device,int new_ID) {
		device.device_id=new_ID;
	}
	
	// Takes device as reference and return this reference
	public static Device GiveMyDevice(Device device) {
		return device;
	}
	

}
