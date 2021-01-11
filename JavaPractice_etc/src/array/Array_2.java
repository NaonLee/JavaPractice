package array;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int std;
		int maxStd, minStd;
		int max = 0, min = 100;
		int sum = 0;
		maxStd = minStd = 0;
		int[] arr;
		
		System.out.print("Number of students: ");
		std = sc.nextInt();
		arr = new int[std];
		System.out.println();
		
		//Enter the score
		for(int i = 0; i < arr.length; i++) {
			System.out.print("student " + (i+1) + "'s score : ");
			arr[i] = sc.nextInt();
			sum += arr[i];	//sum of all scores
		}
		
		System.out.println();
		for(int i = 0; i < arr.length; i++) {	
			//Print all students' score
			System.out.print("Student number " + (i+1) + "'s score : " + arr[i]) ;

			//String m = (i+1 != arr.length)?", ": " ";
			//the last student won't print ','
			if (i + 1 != arr.length)
				System.out.print(", ");
			
			//set highest score and lowest score
			if(max < arr[i]) {
				max = arr[i];
				maxStd = i+1;
			} 
			if(min > arr[i]) {
				min = arr[i];
				minStd = i+1;
			}	
		}
		
		System.out.println();

		System.out.println();
		System.out.println(maxStd + " has the heighst score and the score is " + max);
		System.out.println( minStd + " has the lowest score and the score is " + min);
		System.out.println("Sum of students' scores: " + sum);

	}

}
