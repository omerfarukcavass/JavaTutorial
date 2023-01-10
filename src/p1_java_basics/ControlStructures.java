package p1_java_basics;

public class ControlStructures {

	public static void main(String[] args) {

		
		boolean hungry=true;
		String message;
		if(hungry) {
			message="Hungry";
		}
		else {
			message="Not hungry";
		}
		System.out.println(message);
		
		int sayý=3;
		switch(sayý) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			default:
				System.out.println("other");break;
		}
		
		
		
		
	}

	
	
	
}
