package triangle.tree;

import java.util.Scanner;

public class X_masTree {

	public static void main(String[] args) {

		triangle(5);
		triangle(7);
		triangle(9);
		System.out.println("      		  │   │      ");
		System.out.println("     		  │   │      ");
		System.out.println("   	      ┌───────────┐   ");
		System.out.println("   	      │           │    ");
		System.out.println("   	      │           │    ");
		System.out.println("              │           │    ");
		System.out.println("              └───────────┘    ");


		System.out.println("               Merry X-mas!      ");
	}
	
	private static void triangle(int height) {
		for(int i = 0; i < height;i++) {
			for(int j = 0; j < 20 - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i * 2 + 1); j++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
	}
	
}

