package javaBasic;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;		//usually use capital for constant
		final double PI = 3.14;			//constant never be changed. PI is constant, 3.14 is literal

		if (PI != 3.14)
			System.out.println("FALSE");
		else
			System.out.println("TRUE");
	}

}
