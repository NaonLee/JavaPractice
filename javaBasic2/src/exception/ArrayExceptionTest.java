package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		try {
			for(int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			//return;	"end" will not appear
		}finally {								//it have to act if try acts
			System.out.println("finally");
		}
		System.out.println("end");				//if try catch doesn't exist, end won't be printed
	}

}
