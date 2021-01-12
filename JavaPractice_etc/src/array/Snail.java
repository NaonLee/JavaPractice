package array;

public class Snail {

	public static void main(String[] args) {
		
		snail_1();
	}

	//start (0,0)
	public static void snail_1() {
		
		int index = 5;
		int[][] arr = new int[index][index];
		
		int k = 1;		//value
		int r = 0;		//row
		int c = -1;		//column
		int num = 1;	//decrease/increase number
		
		while(true) {
			//static row, change column
			for(int i = 0; i < index; i++) {
				c = c+num;
				arr[r][c] = k++;
			}
			index = index-1;
			if(index <= 0) break;
			
			//static column, change row
			for(int i = 0; i < index; i++) {
				r = r + num;
				arr[r][c] = k++;
			}
			num = num * (-1);
		}
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr.length; col++) {
				System.out.printf("%3d", arr[row][col]);
			}
			System.out.println();
		}
	}
	//start (0,index)
	public static void snail_2() {

		int index = 5;
		int[][] arr = new int[index][index];
		
		int k = 1;
		int r = 5;		//row
		int c = 0;		//column
		int num = -1;	//decrease/increase number
		
		while(true) {
			//change row, static column
			for(int i = 0; i < index; i++) {
				r += num;
				arr[r][c] = k++;
			}
			
			if(--index <= 0) break;
			num =- num;
			
			//change column, static row
			for(int i = 0; i < index; i++) {
				c += num;
				arr[r][c] = k++;
			}
		}
		
		for(int[] el : arr) {
			for(int el2 : el) {
				System.out.printf("%3d", el2);
			}
			System.out.println();
		}
	}
}
