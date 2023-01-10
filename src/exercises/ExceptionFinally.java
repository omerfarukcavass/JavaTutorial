package exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ExceptionFinally {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		List<String> l = readFileByName("randomName.txt");
		System.out.println("end main");
	}
	
	public static List<String> readFileByName(String fileName) throws IOException{
		List<String> lines = new ArrayList<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName)); // NOSONAR
			String line = br.readLine();

			while (line != null) {
				String[] tokens = line.split(",");
				if ("D".equals(tokens[0])) {
					lines.add(line);
				}
				line = br.readLine();
			}
			br.close();
		} 
		finally {
			System.out.println("finally");
		}
		System.out.println("method end.");
		return lines;
	}
	

}
