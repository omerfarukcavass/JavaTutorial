package p6_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ApplicationRun {

	public static void main(String[] args) {

//		System.out.println("Enter some text: ");
//		Scanner scanner=new Scanner(System.in);
//		String input= scanner.nextLine();		
//		System.out.println(input);

		// Read from txt file:
		try {
			File myFile = new File("text12.txt");
			Scanner myScanner = new Scanner(myFile);
			while (myScanner.hasNextLine()) {
				String line = myScanner.nextLine();
				System.out.println(line);
			}
			myScanner.close();

		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("File not found...");
		}

		
		
		// Invoke your method that can throw exception
		try {
			System.out.println(MyUtilClass.Substract_10(5));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// Invoke your method that can throw your own exception
		try {
			System.out.println(MyUtilClass.Substract_20(15));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Programs continue even if it throws exceptions..");
		System.out.println("Programs continue even if it throws exceptions..");
		System.out.println("Programs continue even if it throws exceptions..");
		System.out.println("Programs continue even if it throws exceptions..");
		System.out.println("Programs continue even if it throws exceptions..");
	}

}
