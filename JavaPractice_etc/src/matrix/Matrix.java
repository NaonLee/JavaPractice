package matrix;

import java.util.Scanner;

//Array practice
public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Matrix size: ");
		int index = sc.nextInt();
		int arr[][] = new int[index][index];
		
		//starts the number from the last row, first column
		for(int i = arr.length-1, v =1; i > -1 ; i--) {
			for(int j = index - i - 1; j < index; j++) {
				 arr[i][j] = v++;
			}
		}
		
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(index-i-1 > j)
					System.out.print("   ");
				else 
					System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
