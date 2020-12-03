package javaBasic;

public class Variable {

	public static void main(String[] args) {
		int num = 10;		//10 Decimal
		int bnum = 0B1010;	//10 Binary
		int onum = 012;		//10 Octal
		int hnum = 0XA;		//Hexadecimal
		
		System.out.println(num);
		System.out.println(bnum);
		System.out.println(onum);
		System.out.println(hnum);
		
		long lnum = 12345678900L;	//Attached L to set identifier as 'long'	
		double dnum = 0.12;
		float fnum = 0.12F;			//Attached F to set identifier as 'float'
		
		char ch = 'A';		//character
		int ch2 = 67;		//ASCII
		
		System.out.println("saved character: " + ch + ", ASCII: "+ (int)ch);
		System.out.println("saved Integer(ASCII): " + ch2 + ", chracter: "+ (char)ch2);
		
		var numInt = 10;			//inference. ONLY for local
		var numDobule = 10;
		var str = "hello";
	
		System.out.println(numInt, numDobule, str);
	}

}
