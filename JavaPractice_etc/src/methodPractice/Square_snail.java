package methodPractice;

import java.util.Scanner;

//square snail starts last row, first column
public class Square_snail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrSize;
		int[][] arr;
		
		System.out.print("Array size(2~9): ");
		arrSize = sc.nextInt();
		
		while(arrSize<2 || arrSize>9 ) {
			System.out.print("Retry: ");
			arrSize = sc.nextInt();
		}
		arr = new int[arrSize][arrSize];
		
		snail(arr);
		System.out.println();
		
		for(int[] i : arr) {
			for(int j : i) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
	}
	
	static void snail(int[][] arr) {
		int arrSize = arr.length;
		int size = arrSize;
		int row = arrSize-1, column = -1;
		int value = 1;
		int increase = 1;
		
		while(true) {
			for (int i = 1; i <= size; i++) {
				column += increase;
				arr[row][column] = value++;
			}
			
			increase =- increase;
			if(size <= 1) return;
			size--;
			
			for(int i = 1; i <= size; i++) {
				row += increase;
				arr[row][column] = value++;
			}
		}
	}

}

