package p8_mygenerics;

public class Accountant extends Employee{
	
	
	@Override
	public void work() {
		System.out.println("Accountant working as employee...");
	}
	
	public void workAsAccountant() {
		System.out.println("Accountant working as accountant...");
	}
	
	
}
