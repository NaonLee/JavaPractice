package matrix;

import java.util.Scanner;

public class Matrix_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Matrix size: ");
		int index = sc.nextInt();
		int arr[][] = new int[index][index];

		for(int j = index-1, v = 1; j> -1; j--) {
			for(int i = 0 ; i <= j; i++) {
				arr[i][j] = v++;
			}
		}
		
		for(int i = 0; i < index; i++) {
			for(int j = 0; j < index; j++) {
				if(i > j)
					System.out.print("   ");
				else
					System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
