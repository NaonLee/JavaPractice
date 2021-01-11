package array;

//print a matrix
public class Array_1 {
	public static void main(String[] args) {
		int[][] a = new int[4][3];
		
		//Last number will be at the first row, last column 
		for(int j = 0, v = 1; j < a[0].length; j++) {
			for(int i = a.length-1; i > -1; i--) {
				a[i][j] = v++;
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
