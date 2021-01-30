package sort;

import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] selectionSort = {22,15,63,122,64,5,64,88,1};
		int value;		//search value
		int first = 0, last = selectionSort.length-1;
		int finding = -1;
		
		for(int i = 0, t; i < selectionSort.length; i++) {
			for(int j = i+1; j < selectionSort.length; j++) {
				if(selectionSort[i] > selectionSort[j]) {
					t = selectionSort[i];
					selectionSort[i] = selectionSort[j];
					selectionSort[j] = t;
				}
			}
		}
		
		for (int i : selectionSort) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("Search value: ");
		value = sc.nextInt();
		
		finding = binary(selectionSort, value, first, last);
		
		if(finding == -1) System.out.print("There is no such value");
		else System.out.printf("Value %d's index is %d in selectionSort", value, finding+1);

		
	}
	
	static int binary(int[] arr, int value, int first, int last) {
		int middle;
		
		if(first > last) return -1;
		
		middle = (first + last) /2;
		
		if(value == arr[middle]) {
			return middle;
		} else if(value < arr[middle]) {
			last = middle - 1;
		} else {
			first = middle + 1;
		}
		return binary(arr, value, first, last);
	}
	
}
