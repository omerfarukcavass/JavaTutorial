package p7_mycollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Lists {

	
	public static void main(String[]args) {
		
		/* Both ArrayList and LinkedLists are lists that you can add some items. 
		 * Both of them implements List class.
		 * The difference is their implementation: 
		 * 
		 * 		ArrayList use arrays and resize as needed.
		 * 		Starts with 10 and doubles as exceeds size.
		 * 		Faster for retrieving (get)
		 * 
		 * 		Linkedlist used Node classes. 
		 * 		As new items come, another node is added.
		 * 		Faster for manipulating. 
		 */
		
		
		// ============ ArrayList ====================
		
		ArrayList<String> words=new ArrayList<String>();
		words.add("first item");
		words.add("second item");
		words.add("third item");
		
		System.out.println(words.get(0));
		
		for(String str:words) {
			System.out.println(str);
		}
		
		
		
		// ArrayList<int> ints=new ArrayList<int>();   you cannot put primitive types
		ArrayList<Integer> sayilar=new ArrayList<Integer>();  // use class versions
		
		for(int i=0;i<5;i++) {
			sayilar.add(i);
		}
		
		for(int sayi:sayilar) {
			System.out.print(sayi+" ") ;
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		// ============ LinkedList ====================
		
		LinkedList<Integer> numbers=new LinkedList<Integer>();
		
		for(int i=0;i<5;i++) {
			numbers.add(i);
		}
		numbers.removeFirst();
		
		for(int i=0;i<numbers.size();i++) {
			System.out.print(numbers.get(i)+" ") ;
		}
		System.out.println();
		
		
		LinkedList<int[]> lists= new LinkedList<int[]>(); // you can also create list of arrays. 
		
		
		List<Nesne> nesneler=new LinkedList<Nesne>(); // you can use List as reference.
		Nesne nesne1=new Nesne();
		
		nesneler.add(nesne1);
		nesneler.add(new Nesne(55));
		nesneler.add(new Nesne(34));
		nesneler.add(new Nesne());
		//nesneler.removeFirst();  list reference cannot reach removeFirst since it is defined in LinkedList
		
		for(Nesne item:nesneler) {
			System.out.println(item.eleman);
		}
		
		PrintElementsofList(nesneler);  // linkedlist: Nesne
		PrintElementsofList(numbers);   // linkedlist: int
		PrintElementsofList(sayilar);   // arraylist: int
		
		
		List<Nesne> nesneler2=new ArrayList<>();
		nesneler2.add(new Nesne());
		nesneler2.add(new Nesne());
		nesneler2.add(new Nesne());
		PrintElementsofList2(nesneler2);

		
	}
	
	public static void PrintElementsofList(List list) {
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)); 
			//list.get(i).nesneFun(); cannot make this since it is not defined that it is list of Nesne class.
		}
		
		
	}
	
	public static void PrintElementsofList2(List<Nesne> list) {
		
		for(int i=0;i<list.size();i++) {
			list.get(i).nesneFun();  // now can call nesneFun
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
