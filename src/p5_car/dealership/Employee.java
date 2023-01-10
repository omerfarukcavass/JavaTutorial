package p5_car.dealership;

public class Employee {

	public void HandleCustomer(Customer customer, Vehicle vehicle, boolean finance) {
	
		if(finance) {
			runCreditHistory(customer,vehicle);
		}
		else if(vehicle.getPrice()<customer.getCashOnHand()) {
			processTransaction(customer,vehicle);
		}
		else {
			System.out.println("Bring more money");
		}
		
		
	}
	
	private void runCreditHistory(Customer cust, Vehicle vehicle) {
		
		int amount =vehicle.getPrice()-cust.getCashOnHand();
		cust.setCashOnHand(0);
		
		System.out.println(cust.getName() + " purhcased vehicle "+ vehicle);
		System.out.println(cust.getName() + "current cash on hand is "+cust.getCashOnHand());
		System.out.println("===================================");
		
	}
	
	private void processTransaction(Customer cust,Vehicle vehicle) {
		
		cust.setCashOnHand(cust.getCashOnHand()-vehicle.getPrice());
		
		
		System.out.println(cust.getName() + " purhcased vehicle "+ vehicle);
		System.out.println(cust.getName() + "'s current cash on hand is "+cust.getCashOnHand());
		System.out.println("===================================");
		
		
	}
	
	
}
