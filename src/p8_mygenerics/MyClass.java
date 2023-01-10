package p8_mygenerics;

// Generic class with types t1,t2
public class MyClass<t1,t2>{

	// t1 and t2 can be any type. But once they are specified, 
	// variables should match those types.
	t1 item1; 
	t2 item2;  
	
	
	public MyClass() {
		
	}
	
	public MyClass(t1 item1, t2 item2) {
		super();
		this.item1 = item1;
		this.item2 = item2;
	}


	public t1 getItem1() {
		return item1;
	}


	public void setItem1(t1 item1) {
		this.item1 = item1;
	}


	public t2 getItem2() {
		return item2;
	}


	public void setItem2(t2 item2) {
		this.item2 = item2;
	}
	
	
	
	
}
