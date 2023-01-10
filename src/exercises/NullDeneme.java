package exercises;

public class NullDeneme {

	public static void main(String[] args) {
		
		String str=null;
		
		int x=10;
		if(x<2) {
			str="omer faruk";
		}
		
		/*
		 * Burda eðer önce str.equals("omer faruk") koysaydýk 
		 * çalýþýrken null pointer exception alýrdýk. Þuan null olduðu için
		 * ikinci kýsým hiç çalýþmadan if blok'undan çýkýyor.
		 */
		if( str!=null && str.equals("omer faruk")) {
			System.out.println(str);
		}
		
		
		

	}

}
