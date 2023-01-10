package exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsSize {

	public static void main(String[] args) {
		
		ExecutorService executor=Executors.newFixedThreadPool(50);
		for(int i=0;i<50;i++) {
			executor.execute(new MyTask(i,"Pool-1"));
		}
		executor.shutdown();
		
		ExecutorService executor2=Executors.newFixedThreadPool(50);
		for(int i=0;i<50;i++) {
			executor2.execute(new MyTask(i,"Pool-2"));
		}
		executor2.shutdown();

	}

}



class MyTask implements Runnable{

	int taskno;
	String poolname;
	public MyTask(int taskno,String poolname){
		this.taskno=taskno;
		this.poolname=poolname;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Task no:"+taskno+" iter:"+i +" Poolname: "+poolname);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}


