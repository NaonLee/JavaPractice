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
	
	//hourglass with variables(st, ed)
	public static void hourglass_2() {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height of hourglass: ");
		int st, ed;		//st: start point of stars, ed:end point of stars
		int height = sc.nextInt(); // height
		int middle = height / 2 + 1; // middle number
		st = ed = middle;
		System.out.println();
		
		for(int i = 1; i <= height; i++) {
			if(i <= middle) {
				ed = height + 1 - i;
				st = i;
			} else {
				ed = i;
				st = height  + 1 - i;
			}
			for(int j = 1; j <= ed; j++) {
				if(j < st)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
