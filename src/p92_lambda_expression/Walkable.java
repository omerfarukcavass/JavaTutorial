package p92_lambda_expression;

/*
 * An interface with one abstract method is 
 * called functional interface. They can be used  
 * in lambda expressions.
 * 
 * Using annotations will help you when making 
 * a violation like creating more than one method inside 
 * a FunctionalInterface.
 * 
 */

@FunctionalInterface
public interface Walkable {

	public void walk();

}
