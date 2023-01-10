package p9_multi_threading;

public class Application1 {

	public static void main(String[] args) {

		System.out.println("First thread started:");
		Task myTask = new Task("Thread A");
		myTask.start(); // this method call run method.

		// Starting a thread takes some time.
		// Before first thread started, this line was executed by main thread.
		System.out.println("Second thread started:");
		Task myTask2 = new Task("Thread B");
		myTask2.start();

		
		
		// Another way of creating threads:
		System.out.println("Third thread started:");
		TaskRunnable myTask3 = new TaskRunnable("Thread C");
		Thread myThread3=new Thread(myTask3); // give runnable into constructor of thread
		myThread3.start();
		
		
		
		/*
		 * We can create threads with "Anonymous classes".
		 * Runnable is an interface. We don't create an instance of runnable interface here.(we can't anyway)
		 * By overriding run method, we created a class that implements runnable interface.
		 * And we directly created an object of this class here.(no class name) 
		 */
		
		
		// Another way of creating threads:
		System.out.println("Fourth thread started:");
		Thread myThread4=new Thread(new Runnable() {

			@Override
			public void run() {
				
				for (int i = 0; i < 100; i++) {
					System.out.println("Number:" + i + "--" + Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
		});
		myThread4.start(); // Thread name: Thread-3
		
		
		
		
	}

}

// A task that can run independent of main thread.
// start method of thread will call run method of runnable.
class Task extends Thread {
	String thread_name;

	public Task(String thread_name) {
		this.thread_name = thread_name;
	}

	public void run() {
		// This method is called when thread started.
		Thread.currentThread().setName(this.thread_name);

		for (int i = 0; i < 100; i++) {
			System.out.println("Number:" + i + "--" + Thread.currentThread().getName());
			try {
				Thread.sleep(10); // miliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

/*	We can also create Runnable classes and
 *  give it to a thread and then call start method 
 * 	of thread. Start method will call run method of 
 *  runnable class.
 * 
 */


class TaskRunnable implements Runnable {

	String thread_name;
	public TaskRunnable(String name) {
		this.thread_name=name;
	}
	
	@Override
	public void run() {

		// This method is called when thread started.
		Thread.currentThread().setName(this.thread_name);

		for (int i = 0; i < 100; i++) {
			System.out.println("Number:" + i + "--" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
