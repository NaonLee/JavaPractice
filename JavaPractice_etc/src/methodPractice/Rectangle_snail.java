package methodPractice;

import java.util.Scanner;

public class Rectangle_snail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr;
		int rowSize, columnSize;
		
		//create snail until type 0 to row size
		while(true) {
			System.out.print("Row size: ");
			rowSize = sc.nextInt();
			if(rowSize == 0) {
				sc.close();
				break;
			} else {
				System.out.print("Column size: ");
				columnSize = sc.nextInt();
				
				arr = new int[rowSize][columnSize];
				snail(arr);
				System.out.println();
				
				for(int[] i : arr) {
					for(int j : i) {
						System.out.printf("%3d", j);
					}
					System.out.println();
				}
				System.out.println();
			}		
		}	
	}

	public static void snail(int[][] snail) {
		int row = snail.length-1;
		int column = -1;
		int flag = 1;
		int colSpin = snail[0].length, rowSpin = snail.length-1;
		int value = 1;
		
		while(true) {
			for(int i = 0; i < colSpin; i++)
				snail[row][column += flag] = value++;
			colSpin--;
			
			if(rowSpin <= 0) return;		//if row spin is ended, stop
			flag =- flag;
			
			for(int i = 0; i < rowSpin; i++)
				snail[row += flag][column] = value++;
			rowSpin--;
			if(colSpin <= 0) return;		//if col spin is ended, stop
		}
	}
	
}
