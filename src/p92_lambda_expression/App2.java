package p92_lambda_expression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App2 {

	public static void main(String[] args) {

		/*
		 * There are build in java functional interfaces
		 * that we can use. In this lesson we are introduced 
		 * two of them: Predicate, Function. You can look at others
		 * from java.util.function package.
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
		 */

		List<Car> cars = Arrays.asList(
				new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700),
				new Car("Toyota", "Land Cruiser", "White", 48500),
				new Car("Toyota", "Corolla", "Black", 16200),
				new Car("Toyota", "Camry", "Blue", 24000),
				new Car("Nissan", "Sentra", "White", 17300),
				new Car("Mitsubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wrangler", "Red", 24500)
				);
		
		
//		printCarsPriceRange(cars, 10000, 20000);
//		System.out.println();
//		printCarByColor(cars,"White");
//		System.out.println();
		
		
		/* We can use anonymous classes to fill CarCondition or 
		 * use lambda expression.
		 * 
		 * Using lambda expressions we can get rid of writing
		 * multiple methods. 
		 */
		
		
		// Anonymous classes.
		printCars(cars, new CarCondition() {

			@Override
			public boolean test(Car car) {
				if(car.getPrice()>= 10000 && car.getPrice()<= 20000) {
					return true;
				}
				return false;
			}
			
			
		});
		System.out.println();
		
		
		// Lambda  usage. V1
		CarCondition whiteCars = (Car car) -> {
			if(car.getColor().equals("White")) {
				return true;
			}
			return false;
		};		
		
		printCars(cars, whiteCars);
		System.out.println();
		
		
		// Lambda  usage. V2  -- works same as V1
		printCars(cars, (car)->
		{
			if(car.getColor().equals("White")) {
				return true;
			}
			return false;
		}  
		);
		System.out.println();
		
		
		// Lambda  usage. V3
		printCars(cars, (car)-> car.getPrice()>= 10000 && car.getPrice()<= 20000 );
		System.out.println();
		
		
		// Lambda  usage. V4  -- same as above, generic way
		printCarsGeneric(cars, (car)-> car.getPrice()>= 10000 && car.getPrice()<= 20000 );
		System.out.println();
		
		
		
		/*
		 *	Actually in java there are lots of build in functional interfaces  
		 *  that we can make use of. One of them is Predicate which is almost the 
		 *  same as our Condition interface.
		 * 
		 *        Predicate = our Condition interface
		 */
		
		// same as "Lambda  usage V4" using Predicate.
		printCarsPredicate(cars, (car)-> car.getPrice()>= 10000 && car.getPrice()<= 20000 );
		System.out.println();
		
		// Our MyFunction interface which is same as  Function interface in java
		MyFunction<Integer,String> integerToString = (number) -> number.toString(); 
		System.out.println(integerToString.apply(100));
		
		// Function interface build in java
		Function<Integer,String> intToString = (number) -> number.toString(); 
		System.out.println(intToString.apply(100));
		
		
		
	}
	
	// a method that can do jobs of other old style methods.
	public static void printCars(List<Car> cars,CarCondition condition ) {
		for(Car c: cars) {
			if(condition.test(c)) {
				c.printCar();
			}
		}
	}
	
	// generic version of above method
	public static void printCarsGeneric(List<Car> cars,Condition<Car> condition ) {
		for(Car c: cars) {
			if(condition.test(c)) {
				c.printCar();
			}
		}
	}
	
	// same as above method using Java build in interface Predicate
	public static void printCarsPredicate(List<Car> cars, Predicate<Car> condition ) {
		for(Car c: cars) {
			if(condition.test(c)) {
				c.printCar();
			}
		}
	}
	
	
	
//	// old style methods
//	public static void printCarsPriceRange(List<Car> cars, int low, int high) {
//		for(Car c: cars) {
//			if(low <= c.getPrice() && c.getPrice() <= high) {
//				c.printCar();
//			}
//		}
//	}
//	
//	// old style methods 
//	public static void printCarByColor(List<Car> cars, String color) {
//		for(Car c: cars) {
//			if( c.getColor().equals(color)) {
//				c.printCar();
//			}
//		}
//	}
	
	
	
	
	

}
// functional interface that checks some conditions
interface CarCondition{
	public boolean test(Car car);
}

// generic version of above interface
interface Condition<T>{
	public boolean test(T object);
}


/*
 * This functional interface actually exist in
 * java with name Function. We wrote ours.
 */
interface MyFunction<T,R>{
	R apply(T t);
}


