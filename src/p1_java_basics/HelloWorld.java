package p1_java_basics;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		
		int sayý=1000;
	    long sayý1=3334333333333L; // L koymazsam int sanýp sýnýr hatasý verir
	    long sayý5=454; // hata yok ama gereksiz hafýza kullanýmý var
	    short sayý6=32767; // maximum short number
	    short sayý7=-32768; // negatif ayný þekilde
	    //short sayý8=-32769; // hatalý
	    byte verySmall=127; //maximum byte number.
	    byte verySmallNeg=	-128; // min byte number.
	    
	    // flaot:7 precision   double:15 precision
		float sayý2=344545454.455F; // f koymazsam double sanýp hata verir
		float sayý3=4345345; // int'i float'a cast eder.
		//int sayý9=445.3434f;  // float'ý int'e cast etmez.
		float sayý4=454345334553243545L; // float ve double long kadar büyük tutabilir.
		double sayý10=43545.8343f; // float'ý double'a cast eder.
		
		/*  Genel kural: Kayýp var ise otomatik cast etmez :
		 *  float to int , double to float, double to int ...
		 */

		
		boolean cond=true;
		char letter='%';
		
		
		
		
//      JAVA Default variable values
		
//		byte    0
//		short   0
//		int 0
//		long    0L
//		float   0.0f
//		double  0.0d
//		char    '\u0000'
//		String (or any object)      null
//		boolean false
		
		
		
	}

}
