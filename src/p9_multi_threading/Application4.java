package p9_multi_threading;

import java.util.ArrayList;
import java.util.List;

public class Application4 {
	
	public static void main(String args[]) {
		
		List<Integer> questionList=new ArrayList<>();
		
		Thread task1=new Thread(new Producer(questionList));
		Thread task2=new Thread(new Consumer(questionList));
		
		task1.start();
		task2.start();
	}
	
	
}
