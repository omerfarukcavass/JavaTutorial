package p5_car.dealership;



public class Vehicle {
	
	private String vehicle_name;
	private int price;
	
	
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [vehicle_name=" + vehicle_name + ", price=" + price + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((vehicle_name == null) ? 0 : vehicle_name.hashCode());
		return result;
	}
	
	// This method checks if the data that two objects has are the same.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (price != other.price)
			return false;
		if (vehicle_name == null) {
			if (other.vehicle_name != null)
				return false;
		} else if (!vehicle_name.equals(other.vehicle_name))
			return false;
		return true;
	}
	
	/*
	 * All classes in java inherits from Object class. 
	 * So, above we override toString and equals methods in Object class.
	 */
	
	
	
	

	
}
