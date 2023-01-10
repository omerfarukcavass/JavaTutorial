package p9_multi_threading;

import java.util.concurrent.BlockingQueue;

public class ConsumerNew implements Runnable {

	BlockingQueue<Integer> questionQueue;
	
	public ConsumerNew(BlockingQueue<Integer> questionQueue) {
		this.questionQueue=questionQueue;
	}
	
	@Override
	public void run() {
		
		while(true) {
			try {
				System.out.println("Question answered: " + questionQueue.take());
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		
		
	}

}
