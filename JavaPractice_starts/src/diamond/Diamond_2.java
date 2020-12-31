package diamond;

import java.util.Scanner;

//Diamond without variables (use only middle numbers and height)
public class Diamond_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height;
			
		System.out.print("출력할 줄 수 입력: ");
		height = sc.nextInt();
		int n = height/2 +1;	//the middle number
		

		for(int i = 1; i <= height; i++) {
			if(i <= n) {						//row>=middle number: print the upper part of the diamond
				for(int j = 1; j < n+i; j++) {	//end point of column < middle number+row
					if(n-i >= j)				
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			else {								//row<middle number: print the bottom part of the diamond
				for(int j = 1 ; j <= height + n - i; j++) {	//end point of column <= height+middle number-row
					if(i-n >= j)			
						System.out.print(" ");
					else
						System.out.print("*");
				}	
			}
			System.out.println();
		}

	}

}
