package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDeneme {

	public static void main(String[] args) {
		
		Map<String,Integer> bids=new HashMap<>();
		
		bids.put("Bir", 1);
		bids.put("Ýki", 2);
		bids.put("uc", 3);
		bids.put("dort", 4);
		bids.put("bes", 5);
		bids.put("altý", 6);
		bids.put("yedi", 7);
		
		
		for(Entry<String,Integer> entry : bids.entrySet()) {
			System.out.println(entry.getValue());
			if(entry.getValue()==5) {
				bids.remove("bes");
				//bids.put("on",10);
			}
			
		}
		System.out.println("===============");
		for(Entry<String,Integer> entry : bids.entrySet()) {
			System.out.println(entry.getValue());
		}
		
		
	}

}
