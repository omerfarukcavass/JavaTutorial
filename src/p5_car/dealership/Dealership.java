package p5_car.dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Employee employee1=new Employee();
		
		Vehicle vehicle1=new Vehicle();
		vehicle1.setVehicle_name("bmw");
		vehicle1.setPrice(100);
		
		Vehicle vehicle2=new Vehicle();
		vehicle2.setVehicle_name("audi");
		vehicle2.setPrice(200);
		
		
		Customer customer1=new Customer();
		customer1.setName("ali");
		customer1.setCashOnHand(1000);
		
		Customer customer2=new Customer();
		customer2.setName("veli");
		customer2.setCashOnHand(2000);
		

		customer1.PurchaseCar(vehicle1,employee1,false);
		customer2.PurchaseCar(vehicle2,employee1,false);
		
		
		
		Vehicle vehicle3=new Vehicle();
		vehicle3.setVehicle_name("bmw");
		vehicle3.setPrice(100);

		if(vehicle3.equals(vehicle1)) {
			System.out.println("vehicle1 = vehicle3");
		}
		
		
	}

}
