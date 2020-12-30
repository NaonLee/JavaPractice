package etc;

public class ForPractice_5 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(5-i >= j)
					System.out.print("  ");
				else
					System.out.printf("%2d", i+4);
			}
			System.out.println();
		}
	}
}
