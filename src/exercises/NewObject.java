package exercises;

public class NewObject {

	public static void main(String[] args) {
		
		new MyClassNew().fun();	// this is a valid statement !!!

		new MyClassNew();	// this is also valid although it is lost after creating.
		
	}

}


class MyClassNew {
	
	public void fun() {
		
	}
	
	
}
