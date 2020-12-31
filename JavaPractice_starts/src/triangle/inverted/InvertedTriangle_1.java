package triangle.inverted;

import java.util.Scanner;

//Inverted Triangle using variable n (middle number)
public class InvertedTriangle_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, height;
		
		System.out.print("출력할 줄 수 입력: ");
		height = sc.nextInt();		
		n = height*2-1;

		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= n; j++) {
				if(i > j)
					System.out.print(" ");
				else
					System.out.print("*");
			}			
			n--;
			System.out.println();
		}

	}

}
