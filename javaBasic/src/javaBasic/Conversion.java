package javaBasic;

public class Conversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int num = bNum;		//implicit conversion
		System.out.println("(int)dNum = " + num);
		
		long lNum = 10;
		float fNum = lNum;	//implicit conversion
		System.out.println("(float)lNum = " + lNum);

		double dNum = fNum + num;	//implicit conversion
		System.out.println("(double)(fNum+num)" + dNum);
		
		num = (int)dNum;
		System.out.println("(int)dNum = " + num);		//explicitConversion, lost point
		
		
		dNum = 3.14;
		fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		
		System.out.println("(int)dNum + (int)fNum = " + num1);
		System.out.println("(int)(dNum + fNum) = " + num2);
	}

}
