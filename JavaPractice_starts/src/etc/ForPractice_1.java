package etc;

public class ForPractice_1 {
	public static void main(String[] args) {

		for(int i = 1, v = 1; i <= 6; i++) {
			for(int j = 1; j <= 6-i; j++)
				System.out.printf("%3d", v++);

			System.out.println();
		}
	}
}
