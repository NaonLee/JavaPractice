package funtionPractice;

public class AddFuntion {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = addNum(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}
	
	public static int addNum(int num1, int num2) {
		return num1 + num2;
	}

}
