package p1_java_basics;

//not public: cannot be reached from other packages
class MyUtils {

	
	public static void printSomethingFromUtils(int x) {
		System.out.println("My utils int:"+x);
	}
	
	// public is default
	static void printSomethingFromUtils(String x) {
		System.out.println("My utils string:"+x);
	}
	
	public static void sumTwoNumbers(int n1,int n2) {
		System.out.println(n1+n2);
	}
	
	public static int add10(int number) {
		int result=number+10;
		return result;
	}
	
	private static void privateMethod() {
		System.out.println("This can only be reached within this classs. ");
	}
	
	
	
	
}
