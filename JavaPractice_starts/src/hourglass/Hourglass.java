package hourglass;

import java.util.Scanner;

//hourglass using the middle number
public class Hourglass {

	public static void main(String[] args) {
		
		
	}
	
	public static void hourglass_1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the height of hourglass: ");
		
		int height = sc.nextInt(); //height
		int middle = height/2+1;	//middle number
		 System.out.println();
		 
		for(int i = 1; i <= height; i++) {
			if(i <= middle) {		//if row <= middle number
				for(int j = 1; j <= height-i+1; j++) {
					if(i > j)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			else {
				for(int j = 1; j <= i; j++) {
					if(height-i >= j) 
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void hourglass_2() {
	
		
	}

}
