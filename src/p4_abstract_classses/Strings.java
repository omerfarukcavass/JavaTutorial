package p4_abstract_classses;

public class Strings {

	public static void main(String[] args) {
		

		String str="epias\""; // 6 chars 
		System.out.println(str);
		System.out.println(str.length());
		
		String sub_str=str.substring(2); // begin at index 2
		System.out.println(sub_str);
		
		String sub_str_1=str.substring(2,5); // begin at index 2, until index 5(not included)
		System.out.println(sub_str_1);
		
		
		System.out.println("==========================");

		
		
		String a=new String("omer");
		String b=new String("omer");
		// This compares whether they are the same reference
		if(a==b) {
			System.out.println("a=b");
		}
		else {
			System.out.println("a not equal b");
		}
		
		
		
		// Use this to compare strings
		if(a.equals(b)) {
			System.out.println("a=b");
		}
		else {
			System.out.println("a not equal b");
		}
	
		
		System.out.println("omer" == "omer");
		System.out.println("omer".equals("omer"));
		
		
		
		System.out.println("==========================");
		
		
		
		String h="1234567895555";
		System.out.println(h.charAt(5));  // char at index ..
		System.out.println(h.indexOf("45")); // start index of ... (first occurence)
		System.out.println(h.indexOf("453")); // -1
		System.out.println(h.indexOf('5',5)); // start searching from 5th index)
		System.out.println(h.lastIndexOf('5')); // start searching at the end
		
		
		
		
	}

}
