package p9_multi_threading;

public class MessageProcessor implements Runnable{

	private int message;
	
	public MessageProcessor(int msg) {
		message=msg;
	}
	
	
	
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " [RECEIVED] Message= " + message);
		respondToMessage();
		System.out.println(Thread.currentThread().getName() + " (DONE) Processing Message= " + message);
		
	}




	private void respondToMessage()  {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Unable to process message " + message);
		}
		
	}

	
	
	
	
	
	
	
	
	
	
}
