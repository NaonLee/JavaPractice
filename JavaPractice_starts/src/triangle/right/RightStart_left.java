package triangle.right;

import java.util.Scanner;

public class RightStart_left {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height;
		
		System.out.print("Enther the height of a triangle: ");
		height = sc.nextInt();
		
		for(int i = 1; i <= height; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
