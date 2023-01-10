package exercises;

public class Exceptions {

	/*
	 * Herhangi bir motodda at�lan exception 
	 * yakalanmad��� s�rece bu metodun �a�r�ld��� yerlerde
	 * kontrol etmemiz laz�m. 
	 * 
	 * fun2 fun1'in att��� exception'� yakalad��� i�in main'de 
	 * fun2 direk �a�r�labilir. Ama fun3 fun1'in att��� exception'� 
	 * yakalamay�p, o da �a�r�ld��� yere att��� i�in main'de try catch
	 * i�ine almak zorunday�z.
	 * 
	 * Excepiton'lardan sonra program �al��maya devam eder.
	 * 
	 */
	
	public static void main(String[] args)  {
		
		Deneme deneme= new Deneme();	
		try {
			deneme.fun1();	// fun methodu exception att��� i�in  
		} catch (Exception e) {
			e.printStackTrace();
		}  
		System.out.println("fun1 exception sonras�");
		
		
	
		
		deneme.fun2();  // bu method fun metodunun att��� exception'� yakal�yor. np!
		System.out.println("fun2 exception sonras�");
		
		
		
		
		try {
			deneme.fun3();	// bu method fun metodunun att��� exception� al�p kendi at�yor. Yakalaman laz�m.
		} catch (Exception e) {
			e.printStackTrace();
		}  
		System.out.println("fun3 exception sonras�");
		
		
	}

}

class Deneme{
	
	
	
	
	public void fun1() throws Exception{
		
		throw new IllegalArgumentException("asd");
		
	}
	
	
	public void fun2() {
		
		try {
			fun1();		 // method exception att��� i�in 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void fun3() throws Exception {
		fun1();
	}
	

	
}

