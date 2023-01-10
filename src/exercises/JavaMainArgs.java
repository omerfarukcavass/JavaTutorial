package exercises;

import java.util.Scanner;

public class JavaMainArgs {

	public static void main(String[] args) {
		
		for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

		Scanner scn=new Scanner(System.in);
		int x=Integer.parseInt(scn.nextLine());
		System.out.println(x);
		
	}

}
