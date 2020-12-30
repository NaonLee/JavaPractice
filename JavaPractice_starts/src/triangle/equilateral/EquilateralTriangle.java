package triangle.equilateral;

import java.util.Scanner;

public class EquilateralTriangle {

	public static void main(String[] args) {
		Equilateral2();
	}
	
	public static void Equilateral1() {
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
	
	public static void Equilateral2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 줄 수 입력: ");
		int line = sc.nextInt();
		
		for(int i = 1; i <= line; i++) {
			for(int j = 1; j <= line; j++) {
				if(line - i >= j)
					System.out.print(" ");
				else
					System.out.printf("*");
			}
			for(int j = 1; j <= i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
