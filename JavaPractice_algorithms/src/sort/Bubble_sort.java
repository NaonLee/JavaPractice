package sort;

import java.util.Arrays;
import java.util.Random;

public class Bubble_sort {

	public static void main(String[] args) {
		Random random = new Random();
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(101);
		}

		bubbleSort(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		System.out.println("Original array: " + Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted array: " + Arrays.toString(arr));
	}

}
