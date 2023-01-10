package p4_abstract_classses;

public class ForLoops {

	// CTRL + SHIFT + F : parantezleri sýralar.
	
	public static void main(String[] args) {

		String str = "EnerjiPiyasalariAS";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}

		System.out.println();

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(str.length() - 1 - i) + " ");
		}

		System.out.println();

		for (int i = 0; i <= 100; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println();
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}
