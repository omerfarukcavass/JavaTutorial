package p7_mycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CollectionMethods {

	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> myList=new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(5);
		myList.add(5);
		
		ArrayList<Integer> myOtherList=new ArrayList<Integer>();
		myOtherList.add(1);
		myOtherList.add(5);
		
		myList.addAll(myOtherList);		// add the elements that exist in myOtherList
		System.out.println(myList);
		
		myList.removeAll(myOtherList);	// remove the elements that exist in myOtherList
		System.out.println(myList);
		
		myList.clear();					// clear all elements 
		System.out.println(myList);
		
		System.out.println(myOtherList);
		
		boolean exist=myOtherList.contains(34);  // returns if it exist
		System.out.println(exist);
		
		boolean isEmpty=myList.isEmpty();  // returns if empty
		System.out.println(isEmpty);
		
		
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(5);
		myList.add(5);
		
		myList.retainAll(myOtherList);  // remove elements that are not in myOtherList
		System.out.println(myList);
		
		
		
		HashSet<Integer> mySet=new HashSet<Integer>();
		mySet.add(11);
		mySet.add(13);
		mySet.add(14);
		mySet.add(13);
		mySet.add(12);
		mySet.add(14);
		System.out.println(mySet);
		
		ArrayList<Integer> myArrayList=new ArrayList<Integer>(mySet);  // create ArrayList from HashSet
		System.out.println(myArrayList);
		
		
		HashSet<String> mySet2=new HashSet<String>();
		mySet2.add("dgdfs");
		mySet2.add("asdgggg");
		mySet2.add("jmjmjyy");
		mySet2.add("xcvcxvcv");
		mySet2.add("fgdfg");
		
		ArrayList<String> myArrayList2=new ArrayList<String>(mySet2);
		
		System.out.println(myArrayList2);
		Collections.sort(myArrayList2);			// Sort list 
		System.out.println(myArrayList2);
		
		
		/*
		 * 	In order to compare special objects, 
		 * 	we have to extend Comparable interface in class and
		 *  override sort method.
		 */
		
		ArrayList<Human> humans=new ArrayList<Human>();
		Human huma1=new Human(45);
		Human huma2=new Human(35);
		Human huma3=new Human(55);
		Human huma4=new Human(65);
		Human huma5=new Human(25);
		
		humans.add(huma1);
		humans.add(huma2);
		humans.add(huma3);
		humans.add(huma4);
		humans.add(huma5);
		
		Collections.sort(humans);
		System.out.println(humans);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
