package p4_abstract_classses;

public class Loops {

	public static void main(String[] args) {
		
		String str="category:apple another category:fish and the last category:device";
		printCategories(str);
	
		
	}
	
	
	
	
	public static void printCategories(String str) {
			
		int index;
		int categoryStart;
		int categoryEnd=0;
		
		
		while(str.indexOf("category",categoryEnd)!=-1) {
			
			index=str.indexOf("category",categoryEnd);
			categoryStart=index+"category".length()+1;
			categoryEnd=str.indexOf(" ",categoryStart);
			if(categoryEnd==-1) {
				categoryEnd=str.length();
			}
			System.out.println(str.substring(categoryStart,categoryEnd));
			
			if(categoryEnd>=str.length()) {
				break;
			}
			
			
		}
		
		
	}
	
	
}



