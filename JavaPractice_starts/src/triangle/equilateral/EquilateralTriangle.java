package triangle.equilateral;

import java.util.Scanner;

public class EquilateralTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height;
		
		System.out.print("Enther the height of a triangle: ");
		height = sc.nextInt();
		
		for(int i = 0; i < height;i++) {
			for(int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i * 2 + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
