package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		Random random = new Random();
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(101);
		}

		selection_sort(arr);
	}
	
	public static void selection_sort(int[] arr) {
		System.out.println("Orginal array: " + Arrays.toString(arr));
		
		int min, temp;
		
		for(int i=0; i<arr.length; i++) {				//find lowest value
			min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min] > arr[j])
					min = j;
			}
		temp = arr[i];
		arr[i] = arr[min];
		arr[min] = temp;
		}
		System.out.println("Sorted result: " + Arrays.toString(arr));
	}
}
