package p93_streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {


	/*
	 * Streams API: very powerful for "stream of operations" 
	 * 
	 * Source ......... Intermediate operations.........Terminal operation
	 * 
	 * Source:
	 * Collections, Files, Data
	 * 
	 * Intermediate Operations:  (Filter, sort, map)
	 * Return a stream so we can chain multiple 
	 * intermediate operations.Order matters, you cannot follow 
	 * works without considering order.
	 * 
	 * Terminal Operations: 
	 * Can return void or a nonstream result such as list or a single value.
	 * forEach() applies 	the same function to each element.
	 * collect() saves the elements into a collection.
	 * count(), max(),sum()
	 * 
	 * 
	 */
	
public static void main(String[] args) throws IOException {
		
		
	IntStream
	.range(1,10)
	.forEach( (x)->System.out.print(x) );
	System.out.println();
	
	
	
	IntStream
	.range(1,20)
	.skip(5)
	.forEach( (x)->System.out.print(x) );
	System.out.println();
	
	
	int sum=IntStream
	.range(1,10)
	.sum();
	System.out.println(sum);
	
	
	Stream
	.of("hello","world","africa")  // converting array to stream
	.sorted()
	.findFirst()
	.ifPresent(	(x)-> System.out.println(x) );
	
	
	
	String[] items = {"twenty","twenty_one", "thirty", "fourty", "fifty"  };
	Stream.of(items)
	.filter((x)-> x.startsWith("t") )
	.sorted()
	.forEach((x)-> System.out.print(x+ " ")  );
	System.out.println();
	
	
	int[] numbers= {1,2,3,4,5,6,7,8,9};
	
	Arrays.stream(numbers)  // another way of converting array to stream
	.map( (x)-> x*x )
	.average()
	.ifPresent( x-> System.out.println(x) );
	
	
	
	
	List<String> elements=Arrays.asList("Apple", "Watermelon", "Orange", "Armut");  // converting elements to list
	elements.stream()	// converting collection to stream
	.map(x->x.toLowerCase())
	.filter( x-> x.startsWith("a"))
	.sorted()
	.forEach(x-> System.out.print(x + ",") );
	System.out.println();
	
	
	
	Stream<String> lines=Files.lines(Paths.get("files/wordFile.txt")); // converts lines to string stream
	lines
	.filter(a-> a.length()>4)
	.sorted()
	.forEach(a-> System.out.println(a));
	lines.close();	// close the files 
	System.out.println();
	
	
	
	List<String> words = Files.lines(Paths.get("files/wordFile.txt"))
			.filter(x->x.contains("a"))
			.collect(Collectors.toList());	// converts stream to collection
	words.forEach(x->System.out.print(x + " "));
	System.out.println();
	
	
	
	Stream<String> rows= Files.lines(Paths.get("files/stockDataCsv.txt"));
	int count= (int) rows		// double to int
			.map(x-> x.split(","))	//converts string stream to string array stream
			.filter(x-> x.length>3)
			.count();
	rows.close();
	System.out.println(count + " rows.");		
	
	
	Stream<String> rows1= Files.lines(Paths.get("files/stockDataCsv.txt"));
	rows1.map(x-> x.split(","))
	.filter(x->x.length>3)
	.filter(x->Integer.parseInt(x[1].trim())>15)  // trim removes  whitespaces in start and end of string
	.forEach(x-> System.out.println(x[0] + " " + x[1] + " "));
	rows1.close();
	System.out.println();
	
	
			
	
	
	
	
	
	
	
	
	
		
	}

}
