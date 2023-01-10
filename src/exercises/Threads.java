package exercises;

public class Threads {

	public static void main(String[] args) {
	
		
		MyThread mythread=new MyThread();
		mythread.start();
//		try {
//			myt.join();		
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
//		joinThread(mythread);  // thread'i main thread'e baðlýyor. Yani bu thread bitmeden aþaðý geçmiyor.
		
		
		joinThreadAfterSometime(mythread,4000);	// thread'in ölmesi için en fazla 4sn bekler. 4sn geçtiði halde thread bitmezse aþaðýdan devam eder.
		
		/*
		 * Alttaki satýr olmazsa "thread sonrasý main" yazýsý "thread bitti" yazýsýndan 
		 * önce yazardý. Aþaðýda thread öldüðü için "thread bitti" hiç yazmýyor.
		 * 
		 */
		
		interruptThread(mythread);	// thread'i öldürür. 
		
		/*
		 * Sleep bitmeden thread öldüðü için sleep interrupted hatasý veriyor.
		 * 
		 */
		
		
		System.out.println("thread sonrasý main");

	}
	
	
	public static void joinThread(Thread t) {
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public static void joinThreadAfterSometime(Thread t,long millisec) {
		
		try {
			t.join(millisec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void interruptThread(Thread t) {
		t.interrupt();
	}
	
	
	
}


class MyThread extends Thread{
	
	
	public void run() {
		
		System.out.println("thread baþlýyor... ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread bitti. ");
		
		
	}
	
	
}