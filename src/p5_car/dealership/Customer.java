package p5_car.dealership;

public class Customer {
	
	// Right click -> source -> generate getters, setter
	
	private String name;
	private int cashOnHand;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(int cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	
	
	public void PurchaseCar(Vehicle vehicle,Employee employee,boolean finance) {
		employee.HandleCustomer(this, vehicle, finance);
	}
	
	

	
}
