package exercises;

public class NullDeneme {

	public static void main(String[] args) {
		
		String str=null;
		
		int x=10;
		if(x<2) {
			str="omer faruk";
		}
		
		/*
		 * Burda e�er �nce str.equals("omer faruk") koysayd�k 
		 * �al���rken null pointer exception al�rd�k. �uan null oldu�u i�in
		 * ikinci k�s�m hi� �al��madan if blok'undan ��k�yor.
		 */
		if( str!=null && str.equals("omer faruk")) {
			System.out.println(str);
		}
		
		
		

	}

}
