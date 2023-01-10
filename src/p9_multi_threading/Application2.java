package p9_multi_threading;

public class Application2 {

	public static void main(String[] args) {
		
		Sequence sequence=new Sequence();
		
		
		/*
		 * There are some repeating values printed out. 
		 * That is because method getNext is not Thread safe.
		 * 
		 * There are 200 lines printed out.Last updated value is not 200.
		 * That is because pausing and resuming threads, as explained in Sequence class. 
		 */
		
//		Worker worker1=new Worker(sequence);
//		worker1.start();
//		
//		
//		Worker worker2=new Worker(sequence);
//		worker2.start();
		

		
		
		/*
		 * After making getNext method thread safe,  
		 * our sequence is incremented as expected.
		 * 
		 * But the order of numbers is not correct.
		 * That is because although getNext is thread safe,
		 * the print statement can be paused for a particular 
		 * thread and the next thread printed last updated value before 
		 * the other printing previous updated value.
		 * 
		 * The last updated value is 200 as expected.
		 */
		
		WorkerThreadSafe worker_ts1=new WorkerThreadSafe(sequence);
		worker_ts1.start();
		
		
		WorkerThreadSafe worker_ts2=new WorkerThreadSafe(sequence);
		worker_ts2.start();
		
		
		
		
		
	}

}


class Worker extends Thread{
	Sequence sequence=null;
	
	public Worker(Sequence sequence) {
		this.sequence=sequence;
	}
	
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+ " : " + sequence.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}



class WorkerThreadSafe extends Thread{
	Sequence sequence=null;
	
	public WorkerThreadSafe(Sequence sequence) {
		this.sequence=sequence;
	}
	
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+ " : " + sequence.getNextThreadSafe());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}





