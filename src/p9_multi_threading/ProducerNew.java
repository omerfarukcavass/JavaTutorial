package p9_multi_threading;

import java.util.concurrent.BlockingQueue;

public class ProducerNew implements Runnable {

	// Thread safe version of queue
	BlockingQueue<Integer> questionQueue;
	int questionNo;
	
	public ProducerNew(BlockingQueue<Integer> questionQueue) {
		this.questionQueue=questionQueue;
	}
	
	@Override
	public void run() {

		while(true) {
			
			try {
				
				/*
				 * In our problem we have one producer and one consumer.
				 * So,two threads wont add questions. We don't need thread safe 
				 * for our problem. Yet, we made it thread safe.
				 * 
				 * Warning: using two nested synchronized blocks will slow down
				 * your program.
				 */
				
				synchronized(this){
					int nextQuestion=questionNo++;	// this line has 3 operations: read, increment, assign
					System.out.println("New question "+ nextQuestion);
					questionQueue.put(nextQuestion);
					Thread.sleep(500);
				}
		
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
