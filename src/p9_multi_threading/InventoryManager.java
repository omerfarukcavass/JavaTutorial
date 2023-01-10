package p9_multi_threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

	List<Product> soldProductList = new CopyOnWriteArrayList<Product>();  // this is thread safe verision of ArrayList.
	List<Product> purchasedProductList = new ArrayList<Product>();

	public void populateSoldProducts() {
		for (int i = 0; i < 100; i++) {

			Product product = new Product(i, "product_" + i);
			soldProductList.add(product);
			System.out.println("Added: " + product);

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public void displaySoldProducts() {

		for (Product product : soldProductList) {

			System.out.println("Printed: " + product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
	
	
	
	

}
