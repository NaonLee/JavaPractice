package etc;

import java.util.Scanner;

public class ForPractice_2 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 1) continue;
			for(int j = 1; j <= i; j++)
				System.out.printf("%dx%d=%2d  ", i, j, i*j);
			System.out.println();
		}
	}
}