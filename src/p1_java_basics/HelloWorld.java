package p1_java_basics;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		
		int say�=1000;
	    long say�1=3334333333333L; // L koymazsam int san�p s�n�r hatas� verir
	    long say�5=454; // hata yok ama gereksiz haf�za kullan�m� var
	    short say�6=32767; // maximum short number
	    short say�7=-32768; // negatif ayn� �ekilde
	    //short say�8=-32769; // hatal�
	    byte verySmall=127; //maximum byte number.
	    byte verySmallNeg=	-128; // min byte number.
	    
	    // flaot:7 precision   double:15 precision
		float say�2=344545454.455F; // f koymazsam double san�p hata verir
		float say�3=4345345; // int'i float'a cast eder.
		//int say�9=445.3434f;  // float'� int'e cast etmez.
		float say�4=454345334553243545L; // float ve double long kadar b�y�k tutabilir.
		double say�10=43545.8343f; // float'� double'a cast eder.
		
		/*  Genel kural: Kay�p var ise otomatik cast etmez :
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
