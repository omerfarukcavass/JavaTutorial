package p9_multi_threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application6 {

	/*
	 * Using thread  safe collections rather than
	 * using wait and notify methods.
	 * 
	 * "Blocking queue" is a queue that supports waiting for a room
	 * to store new elements when list is full,
	 * and waiting to remove when list is empty.
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		BlockingQueue<Integer> questionQueue=new ArrayBlockingQueue<>(5);
		
		Thread t1=new Thread(new ProducerNew(questionQueue));
		Thread t2=new Thread(new ConsumerNew(questionQueue));
		
		t1.start();
		t2.start();
		
	}

	
}
