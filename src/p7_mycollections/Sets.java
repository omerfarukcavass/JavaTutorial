package p7_mycollections;

import java.util.HashSet;
import java.util.LinkedHashSet;

// CTRL + SHIFT + O to import required packages automatically.

public class Sets {

	/*
	 * HashSet: 
	 * 		Doesn't allow duplicates.
	 * 		Doesn't keep insertion order.
	 * 
	 * LinkedHashSet
	 * 		Doesn't allow duplicates.
	 * 		Keeps insertion order.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		HashSet<Integer> mySet=new HashSet<Integer>();
		mySet.add(1);
		mySet.add(7);
		mySet.add(5);
		mySet.add(3);
		mySet.add(7);
		
		for(Integer i:mySet) {
			System.out.println(i);
		}
		
		System.out.println("==========================");
		
		HashSet<String> mySet2=new HashSet<String>();		// also works with strings
		mySet2.add("asd");
		mySet2.add("fsdf");
		mySet2.add("asd");
		mySet2.add("sdfsdf");
		mySet2.add("asdd");
		
		for(String i:mySet2) {
			System.out.println(i);
		}
		
		System.out.println("==========================");
		
		LinkedHashSet<String> mySet3=new LinkedHashSet<String>();		// LinkedHashSet
		mySet3.add("asd");
		mySet3.add("fsdf");
		mySet3.add("asd");
		mySet3.add("sdfsdf");
		mySet3.add("asdd");
		
		for(String i:mySet3) {
			System.out.println(i);
		}
		
		System.out.println("==========================");
		
		
		HashSet<Animal> animals=new HashSet<Animal>();
		animals.add(new Animal(3,"asdddd"));
		animals.add(new Animal(4,"asd"));
		animals.add(new Animal(3,"sdff"));
		animals.add(new Animal(5,"vvv"));
		animals.add(new Animal(3,"sdff"));
		
		for(Animal animal:animals) {
			System.out.println(animal);
		}
		
		System.out.println("==========================");
		
		
		System.out.println(new Animal(3,"sdff").hashCode()); 
		System.out.println(new Animal(3,"sdff").hashCode()); // same hash code
		
	}
	
	
	
	
	
	
}
