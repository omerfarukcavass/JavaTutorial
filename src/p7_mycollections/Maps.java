package p7_mycollections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	/*  *** Maps: Dictionaries in Python. ***
	 * 
	 * Map: 
	 * 		Includes keys and values.
	 * 		Doesn't allow duplicates
	 * 		Doesn't preserve order of insertion.
	 * 
	 * LinkedHashMap:
	 * 		Includes keys and values.
	 * 		Doesn't allow duplicates
	 * 		Preserves order of insertion.
	 *		
	 * TreeMap:
	 *		Same as Map, only difference 
	 *		TreeMap sorts entries in the order of keys
	 *
	 */
	
	public static void main(String[] args) {
		
		HashMap<String,String> myDictionary=new HashMap<String,String>();
		myDictionary.put("apple", "a fruit of color red or green");
		myDictionary.put("phone", "a device that is used for calling");
		myDictionary.put("zzzz", "the as d sss ");
		myDictionary.put("zzzz", "the as d sss ");  // no duplicate
		myDictionary.put("zzzz", "zzzzzzzzzzzzz");  // update entry that have the same key
		myDictionary.put("aaaa", "zzzzzzzzzzzzz");  // allows duplicate in values
		
		
		for(String key:myDictionary.keySet()) {
			System.out.println(key); 
		}
		
		for(String value:myDictionary.values()) {
			System.out.println(value); 
		}
		
		for(Map.Entry<String,String> entry:myDictionary.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
