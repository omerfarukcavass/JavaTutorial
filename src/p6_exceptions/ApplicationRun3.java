package p6_exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ApplicationRun3 {

	// Newer approach for file processing: Try with resources.
	// This will work in java 7 onwards. Not work under java 7
	// This will work for all classes that extends AutoCloseable.
	
	
	public static void main(String[] ARGUMENTS) {
		
		File file = new File("text.txt");
		
		// put fileReader and BufferReader inside try's parenthesize. 
		// you dont need to write finally, all resources in try will be automatically closed.
		
		try (FileReader fileReader = new FileReader(file);
		     BufferedReader bufferedReader = new BufferedReader(fileReader);){
			
			String line = bufferedReader.readLine(); 
			while(line!=null) {
				System.out.println(line);
				line=bufferedReader.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file..");
		} catch (IOException e) {
			System.out.println("Problem reading file " + file.getName());
		} 
		
		
		
	}
	
	
	
}
