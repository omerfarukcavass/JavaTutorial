package p92_lambda_expression;

public class App {

	public static void main(String[] args) {

		/*
		 * In java 8, functional programming concept is introduced. Before, we had to
		 * create classes to invoke functions. The most similar concept before java 8
		 * was anonymous classes.
		 * 
		 * 
		 * The main idea is to override methods in interfaces for each objects differently.
		 * Normally, we have to define a class that implements method in interface. But, in this way 
		 * we had to define new classes for each usage and create object from those classes. By using lambda 
		 * expression or anonymous classes, we can override methods for each object separately.
		 * 
		 */

		Human human = new Human();
		walk(human);

		Robot robot = new Robot();
		walk(robot);

		/*
		 * Anonymous classes
		 * 
		 * We give an object of type walkable on the fly.
		 * 
		 */

		walk(new Walkable() {

			@Override
			public void walk() {
				System.out.println("ananymous class walking...");
			}
		});

		/*
		 * Lambda expression
		 * 
		 * They have type of functional interfaces. Functional interfaces must have at
		 * most 1 method.
		 * 
		 */

		walk(  () -> System.out.println("lambda walking...")  );

		Walkable aBlockOfCode = () -> {

			System.out.println("lambda block ... more than one line");
			System.out.println("lambda block ... more than one line");
		};
		walk(aBlockOfCode);

//		Talkable talkable=()-> System.out.println("asdasd");	talkable is not a functional interface

		
		
		Mathable mathable1= (int a,int b)-> {return a+b;}; 
		System.out.println(mathable1.calculate(5,7));
		
		Mathable mathable2= (a,b)-> a+b; 
		System.out.println(mathable2.calculate(5,7)); // same methods
		
		Mathable mathable3= (a,b)-> {
			if(b==0) {
				return -1;
			}
			return a/b;
		}; 
		System.out.println(mathable3.calculate(14,7));
		
		MyGenericInterface<Integer> myInterface1= (a,b)-> {return a+b;}; 
		System.out.println(myInterface1.work(5, 71));
		
		MyGenericInterface<String> myInterface2= (a,b)-> {return a+b;}; 
		System.out.println(myInterface2.work("5", "71"));
		
		
		
		
	}

	public static void walk(Walkable walkable) {
		walkable.walk();
	}

	
	
	
}

/*
 * We can make generic functional interfaces.
 * 
 */

interface MyGenericInterface<T> {
	public T work(T input1, T input2);
}



