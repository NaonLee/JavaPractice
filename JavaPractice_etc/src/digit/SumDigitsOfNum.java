package digit;

import java.util.Scanner;

//Sum digits of number
public class SumDigitsOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int num = n;
		int count = 1;
		
		while(num >= 10) {
			num = num / 10;
			count*= 10;
		}
		System.out.println("Answer: " + func(n, count));
	}
	
	public static int func(int n, int count) {
		int sum = n/count;
		if(count < 10) {
			return n;
		}
		else {
			return sum + func(n%count, count/10);
		}

	}

}
