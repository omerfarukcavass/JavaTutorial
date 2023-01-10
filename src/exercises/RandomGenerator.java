package exercises;

import java.util.Random;

public class RandomGenerator {

	public static void main(String[] args) {
		Random random=new Random();
		random.setSeed(5534);
		
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());

	}

}
