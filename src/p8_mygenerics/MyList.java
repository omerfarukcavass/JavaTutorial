package p8_mygenerics;

import java.util.ArrayList;

//Generic class with type  T
public class MyList<T> {

	ArrayList<T> myList;
	
	public MyList(){
		myList=new ArrayList<>();	
	}
	
	public void AddtoList(T item) {
		myList.add(item);
	}
	
	public void PrintArray(){
		int count=0;
		for(T item: myList) {
			System.out.println("Item "+count+": "+ item);
			count++;
		}
		System.out.println("=========");
	}
	
	public void PrintArrayReverse(){
		int count=myList.size()-1;
		for(;count>=0;count--) {
			System.out.println("Item "+count+": "+ myList.get(count));
		}
		System.out.println("=========");
	}
	
	
	
	
	
}
