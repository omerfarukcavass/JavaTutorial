package p9_multi_threading;

public class Application3 {

	public static void main(String[] args) throws InterruptedException {

		InventoryManager manager = new InventoryManager();

		Thread inventoryTask = new Thread(new Runnable() {

			@Override
			public void run() {

				manager.populateSoldProducts();

			}

		});

		Thread displayTask = new Thread(new Runnable() {

			@Override
			public void run() {

				manager.displaySoldProducts();

			}

		});

		/*
		 * This has given "ConcurrentModification" error. It means you cannot read and
		 * add simultaneously in collections. "Collections are not thread safe." ..
		 * ArrayList, HashMaps etc. This means: Methods in these classes are not
		 * synchronized.
		 * 
		 * (If you use ArrayList not CopyOnWriteArrayList)
		 */

//		inventoryTask.start();
//		Thread.sleep(500);   		// to make sure that there are at least one added.
//		displayTask.start();

		/*
		 * You can make thread sleep long enough so that all added. Or you can call
		 * Thread.join() which joins this thread to main thread, which means stop until
		 * this thread is completed. But this is not multi-threading, rather a
		 * sequential approach.
		 * 
		 * We can use Concurrent Collections like CopyOnWriteArrayList rather than
		 * ArrayList (thread safe version). displayTask will read products added before
		 * its start method is invoked.
		 */

		inventoryTask.start();
//		Thread.sleep(10000);   		// make main thread sleep 10 secs ---- we cannot sure if all added for a large dataset.
//		inventoryTask.join();		// joins inventoryTask thread to main thread. --- makes the process sequential, not parallel.

		Thread.sleep(500); // sleep 0.5 sec so that some products added
		displayTask.start(); // will display products added in 0.5 sec, not all!

		
		/* IMPORTANT:
		 * 
		 * sleep, join are primitive operations that control 
		 * threads. Don't use them very commonly. 
		 * We'll see some other thread management mechanisms.
		 */
		
		
	
		
		
		
	}

}
