package p9_multi_threading;

/*
 * my own practices...
 * 
 * 	The object passed in synchronized parenthesizes locks other 
 *  threads to reach this object until this block ends.
 * 	This means two threads cannot reach this lock object at the same time.
 *  By wait and notify methods,we control which thread will reach the object.(Application 5)
 * 
 * 	However, other objects  can be reached by other threads and different operations
 *  can be done at the same time.
 * 
 * 
 * 	If we make the whole method synchronized , this means lock object is "this" class.
 *  It is just like writing "synchronized(this)"
 * 
 */

public class Application5 {

	public static void main(String[] args) {

		Object obj = new Object();

		Task1 task1 = new Task1();
		Task2 task2 = new Task2();

		task1.setLockObject(obj);
		task2.setLockObject(obj);
		
		
		/*
		 * Both uses obj as lock object, that is why 
		 * no intervention among print lines. If we used "this" as lock
		 * object (as below) then there would be some interventions.
		 * 
		 */
		
//		task1.setLockObject(task1);
//		task2.setLockObject(task2);
		
		
		
		task1.start();
		task2.start();
		
	}

}

class Task1 extends Thread {

	Object obj_to_lock = null;

	public Task1() {
	}

	public void setLockObject(Object obj) {
		this.obj_to_lock = obj;
	}
	
	
	
	public void run() {

		synchronized (obj_to_lock) {
			for (int i = 0; i < 10; i++) {

				System.out.println("=======");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}

class Task2 extends Thread {

	Object obj_to_lock = null;

	public Task2() {
	}

	public void setLockObject(Object obj) {
		this.obj_to_lock = obj;
	}

	public void run() {

		synchronized (obj_to_lock) {
			for (int i = 0; i < 10; i++) {

				System.out.println("*******");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
