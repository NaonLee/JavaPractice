package etc;

public class ForPractice_4 {
	public static void main(String[] args) {
		for(int i=0, v = 1; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j < i)
					System.out.print("   ");
				else
					System.out.printf("%3d", v++);
			}
			System.out.println();		
		}
	}
}
