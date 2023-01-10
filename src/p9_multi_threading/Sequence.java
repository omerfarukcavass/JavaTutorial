package p9_multi_threading;

public class Sequence {

	private int value=0;
	public int getNext() {
		value++;
		
		/*
		 * value++; this code has two steps: read value and update value
		 * One thread may be stopped after reading the value, and the second thread
		 * updated value. After that, the first thread will update value based on what he read. 
		 * 
		 */
		
		
		return value;
		
	}
	
	
	public int getNextThreadSafe() {
		synchronized (this){
			value++;
			return value;
		}
		
		/*
		 * synchronized makes the codes inside block run as together or not.
		 * cannot pause inside the block.
		 */
		
		
	}
	
	public synchronized int getNextThreadSafeNew() {
		value++;
		return value;
		
		/*
		 * we can make entire method synchronized
		 * this will work same as getNextThreadSafe
		 */
		
	}
	
	
	
	
	
}
