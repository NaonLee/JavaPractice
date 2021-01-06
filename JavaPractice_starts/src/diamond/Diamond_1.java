package diamond;

import java.util.Scanner;

//Diamond using variables
//1-1: fixed height
//1-2: require entering number as a height + use variables(st, ed)
//1-2: require entering number as a height + use variables(st, ed) 2
public class Diamond_1 {
	public static void main(String[] args){
		diamond_1_1();
		diamond_1_2();
		diamond_1_3();
	}
	
	public static void diamond_1_1() {
		int height = 5;			//height
		int n = height/2 +1;	//middle number
		int st = 3, ed = 3;		//st: start point of stars, ed: end point of stars
		
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= ed; j++) {
				if(j < st) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			if (i < 3 ) {
				st--;			//if row is bigger than the middle number, the start point will be decreased
				ed++;			//and the end point will be increased
			}
			else {
				st++;
				ed--;
			}
			System.out.println();
		}
	}
	
	public static void diamond_1_2() {
		
		Scanner sc = new Scanner(System.in);
		int height = 1;
		
		while(height != 0) {
			System.out.print("출력할 줄 수 입력(홀수만 입력하되 끝내려면 '0'입력): ");
			height = sc.nextInt();
			if(height%2 !=0) {
				int st = height/2 +1, ed = height/2 +1;
				System.out.println();
				for(int i = 1; i <= height; i++) {
					for(int j = 1; j <= ed; j++) {
						if(j < st) {
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
					}
					if (i < height/2+1 ) {
						st--;
						ed++;
					}
					else {
						st++;
						ed--;
					}
					System.out.println();
				}
				System.out.println();
			}
			
		}
	}
	
	public static void diamond_1_3() {
		Scanner sc = new Scanner(System.in);
		int height = 1;
		int st, ed;

		for(;;) {
			System.out.print("출력할 줄 수 입력(홀수만 입력하되 끝내려면 '0'입력): ");
			height = sc.nextInt();
			if(height == 0) {
				sc.close();
				break;
			}
			else if (height % 2 == 1) {

				int middle = height / 2 + 1;
				System.out.println();

				for (int i = 1; i <= height; i++) {
					if( i <= middle) {
						st = middle + 1 - i;
						ed = i + middle - 1;
					} else {
						st = i - (middle - 1);
						ed = height + middle -i;
					}
					
					for(int j = 1; j <= ed; j++) {
						if(j < st)
							System.out.print(" ");
						else {

							System.out.print("*");
						}
					}
					System.out.println();
				}
				
			}

		}
	}
}
