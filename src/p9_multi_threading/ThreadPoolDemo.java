package p9_multi_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) {

		/* 
		 * Executer services are the most common way of working with multi-threading.
		 * You just specify the number of threads and give Runnable tasks, it takes care of
		 * all the jobs needed for you.
		 * 
		 * Below we gave 2 as number of threads, so these two threads
		 * will execute tasks. Hence, our executor can execute two tasks parallelly .
		 */
		
		ExecutorService executor = Executors.newFixedThreadPool(2); 
		
		
		Runnable processor1= new MessageProcessor(1);
		executor.execute(processor1);
		
		Runnable processor2= new MessageProcessor(2);
		executor.execute(processor2);
		
		Runnable processor3= new MessageProcessor(3);
		executor.execute(processor3);
		
		Runnable processor4= new MessageProcessor(4);
		executor.execute(processor4);
		
		executor.shutdown();	// rejects any new tasks from being submitted. Shutdowns when all task are done.
//		executor.shutdownNow();    terminate the executor service immediately. don't wait tasks to be completed.
		
		
		
		
//		System.out.println("Submitted all tasks...");		this will print immediately by main thread.
		
		
		
		
		while(!executor.isTerminated()) {
			// just to wait until terminate
		}
		
		System.out.println("Submitted all tasks...");
		
		
		
		
		/*
		 * Instead of while loop to wait until executor is done,
		 * we could wait at most some fixed amount of time.
		 * Below we wait for at most 10 seconds.
		 */
		
//		try {
//			executor.awaitTermination(10, TimeUnit.SECONDS);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Submitted all tasks...");
		
		
		
	}

}
