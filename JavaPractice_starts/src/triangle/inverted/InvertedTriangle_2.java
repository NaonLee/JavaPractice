package triangle.inverted;

import java.util.Scanner;

//Inverted Triangle
public class InvertedTriangle_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height;
		
		do {
			System.out.print("출력할 줄 수 입력 (1보다 큰 자연수): ");
			height = sc.nextInt();
		} while(height <= 1);
		

		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= height*2-i; j++) {
				if(i > j)
					System.out.print(" ");
				else
					System.out.print("*");
			}			
			System.out.println();
		}

	}

}
