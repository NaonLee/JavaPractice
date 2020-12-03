package javaBasic;

public class Complements {

	public static void main(String[] args) {
		int num1 = 0B00000000000000000000000000000101;		//5
		int num2 = 0B11111111111111111111111111111011;		//-5, Two's complement
		

		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}

}
