package triangle.right;

import java.util.Scanner;

public class RightTriangle_right {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height;
		
		System.out.print("Enther the height of a triangle: ");
		height = sc.nextInt();
		
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= height; j++) {
				if(j <= height - i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
