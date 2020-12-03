package javaBasic;

public class Operator {

	public static void main(String[] args) {
		//arithmetic, relational, logical operation
		int num = 12;
		int num2 = 3;
		
		boolean value = ((num = num + 3) < 10) && ((num2 - 3) < 10);
		System.out.println("value = " + value);
		
		boolean value2 = ((num = num + 3) < 10) || ((num2 - 3) < 10);
		System.out.println("value2 = " + value2);
		
		//assignment operation
		int num3 = 1;
		System.out.println("num3 += 1 result: " + (num3 += 1));
		
		//ternary operation
		int num4 = (100 > 10)? 1:2;
		System.out.println("num4 = " + num4);
		
		//bitwise operation
		int num5 = 5;		//0101;
		int num6 = 10;		//1010;
		System.out.println("5 & 10 = " + (num5 & num6));	//0000	& AND: both 1 ->result 1		
		System.out.println("5 | 10 = " + (num5 | num6));	//1111	| OR: one of them 1 -> result 1
		System.out.println("5 ^ 10 = " + (num5 ^ num6));	//1111	^ XOR: two bits are different -> result 1
		System.out.println("5<<3 = " + (num5<<3));			//00000101 -> 00101000
		//Skip unary, bitwise operation
		
	}

}
