package p6_exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ApplicationRun2 {

	/*
	 * Object reference as instance variable need not be assigned null as those take null as default value. 
	 * But local variables must be initialized otherwise you will get compilation error saying 
	 * "The local variable may not have been initialized"
	 */
	
	
	public static void main(String[] arguments) {

		File file = new File("textnew.txt");
		BufferedReader bufferedReader=null; //assign null to use in finally. Otherwise it may not have been initialized.
		FileReader fileReader=null;
		
		try {
			fileReader = new FileReader(file); // ======> FileNotFoundException
			bufferedReader = new BufferedReader(fileReader); // if file not found , codes in try block from this line will not work.

			String line = bufferedReader.readLine(); // ======> IOException
			while(line!=null) {
				System.out.println(line);
				line=bufferedReader.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file..");
		} catch (IOException e) {
			System.out.println("Problem reading file " + file.getName());
		} finally {  // codes in finally always run.  
			try {
				// Use this instead of catching null pointer exception.
				if(bufferedReader!=null) {
					bufferedReader.close();
				}
				if(fileReader!=null) {
					fileReader.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} 
//			catch (NullPointerException ex) {
//				System.out.println("Null pointer: file is most likely never opened."); 
//				
//				/*
//				 * Actually, you dont want to catch a null pointer exception. 
//				 * You should handle where this program occurs. ===>Go to line 34.
//				 */
//				
//			}
			
			
			
		}

		/*
		 * If you dont catch an exception, when it is thrown, your program 
		 * will immediately stop. And the lines below will not run.
		 */
		
		
		System.out.println("=============");
		System.out.println("=============");
		System.out.println("=============");
		System.out.println("=============");
		System.out.println("=============");
		
		
	}

	

}
