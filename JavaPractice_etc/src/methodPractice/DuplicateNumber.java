package methodPractice;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		System.out.println("123: " + checkDup("123"));
		System.out.println("1234464: " + checkDup("1234464"));
		System.out.println("0123456789: " + checkDup("0123456789"));
	}

	public static boolean checkDup(String str) {
		String[] input = str.split("");
		Arrays.sort(input);
		return String.join("", input).equals("0123456789");
	}
}
