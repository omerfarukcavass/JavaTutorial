package p8_mygenerics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericsIntro {

	public static void main(String[] args) {

		MyClass<Integer,String> myClass=new MyClass<>();
		myClass.setItem1(345345);
		myClass.setItem2("naber1");
	
		
		
		MyList<Integer> myList=new MyList<>();
		for(int i=0;i<10;i++) {
			myList.AddtoList(i);
		}
		myList.PrintArray();
		myList.PrintArrayReverse();
		
		
		
		
		HashSet<Integer> set1=new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		HashSet<Integer> set2=new HashSet<>();
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		
		
		Set<Integer> unionSet=UnionOfSets(set1, set2);
		System.out.println(unionSet);
		
		// another way of iterating over collections
		Iterator<Integer> itr=unionSet.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" , ");
		}
		
		
		
		
		
	}
	
	
	// Generic method
	// .........type..return_type...name...parameters...
	public static <T> Set<T> UnionOfSets(Set<T> set1, Set<T> set2){
		Set<T> union =new HashSet<T>(set1); // copy set1
		union.addAll(set2);
		return union;
	}
	
	
	// We can use more than two types for generic methods.
	public static <T,E> Set<T> mymethod(Set<E> set1,Set<T> set2){
		return new HashSet<T>();
	}
	
	
	
	
	

}
