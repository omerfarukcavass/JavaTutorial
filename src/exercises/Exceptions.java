package exercises;

public class Exceptions {

	/*
	 * Herhangi bir motodda atýlan exception 
	 * yakalanmadýðý sürece bu metodun çaðrýldýðý yerlerde
	 * kontrol etmemiz lazým. 
	 * 
	 * fun2 fun1'in attýðý exception'ý yakaladýðý için main'de 
	 * fun2 direk çaðrýlabilir. Ama fun3 fun1'in attýðý exception'ý 
	 * yakalamayýp, o da çaðrýldýðý yere attýðý için main'de try catch
	 * içine almak zorundayýz.
	 * 
	 * Excepiton'lardan sonra program çalýþmaya devam eder.
	 * 
	 */
	
	public static void main(String[] args)  {
		
		Deneme deneme= new Deneme();	
		try {
			deneme.fun1();	// fun methodu exception attýðý için  
		} catch (Exception e) {
			e.printStackTrace();
		}  
		System.out.println("fun1 exception sonrasý");
		
		
	
		
		deneme.fun2();  // bu method fun metodunun attýðý exception'ý yakalýyor. np!
		System.out.println("fun2 exception sonrasý");
		
		
		
		
		try {
			deneme.fun3();	// bu method fun metodunun attýðý exceptioný alýp kendi atýyor. Yakalaman lazým.
		} catch (Exception e) {
			e.printStackTrace();
		}  
		System.out.println("fun3 exception sonrasý");
		
		
	}

}

class Deneme{
	
	
	
	
	public void fun1() throws Exception{
		
		throw new IllegalArgumentException("asd");
		
	}
	
	
	public void fun2() {
		
		try {
			fun1();		 // method exception attýðý için 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void fun3() throws Exception {
		fun1();
	}
	

	
}

