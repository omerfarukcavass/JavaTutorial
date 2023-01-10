package exercises;

public class Generics {

	public static void main(String[] args) {

		MyMethod(new MyInterface<MyClass>() {

			@Override
			public void returnTvalue(MyClass item) {
				item.fun();
			}
			
			
		});
		
		MyMethod( (item) -> item.fun() );
		
		/*
		 * Both implementations are working same.
		 * 
		 */
		

	}

	public static void MyMethod(MyInterface<MyClass> item) {

		MyClass myclass=new MyClass();
		
		item.returnTvalue(myclass);
		
	}
	
	
	
	
}

interface MyInterface<T>{
	
	void returnTvalue(T item);
}

class MyClass{
	
	public void fun() {
		
	}
	
}

