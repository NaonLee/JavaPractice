package arrayPractice;

public class ArrayTest {

	public static void main(String[] args) {
		int[] numbers = new int[5];					//int array: initialized as 0
													//double array: initialized as 0.0, object array: initialized as null
		numbers[0] = 12;		
		numbers[1] = 1;			
		
		System.out.println(numbers.length);
		
		for(int i = 0; i < numbers.length; i ++) {
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}
		
		char[] alphabets = new char[26];
		char ch = 'A';		//65
		
		for(int i = 0; i< alphabets.length; i++, ch++) {
			alphabets[i] = ch;
			System.out.println(alphabets[i]);
		}
		

	}

}
