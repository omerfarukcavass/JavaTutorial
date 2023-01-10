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
		
//		joinThread(mythread);  // thread'i main thread'e ba�l�yor. Yani bu thread bitmeden a�a�� ge�miyor.
		
		
		joinThreadAfterSometime(mythread,4000);	// thread'in �lmesi i�in en fazla 4sn bekler. 4sn ge�ti�i halde thread bitmezse a�a��dan devam eder.
		
		/*
		 * Alttaki sat�r olmazsa "thread sonras� main" yaz�s� "thread bitti" yaz�s�ndan 
		 * �nce yazard�. A�a��da thread �ld��� i�in "thread bitti" hi� yazm�yor.
		 * 
		 */
		
		interruptThread(mythread);	// thread'i �ld�r�r. 
		
		/*
		 * Sleep bitmeden thread �ld��� i�in sleep interrupted hatas� veriyor.
		 * 
		 */
		
		
		System.out.println("thread sonras� main");

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
		
		System.out.println("thread ba�l�yor... ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread bitti. ");
		
		
	}
	
	
}