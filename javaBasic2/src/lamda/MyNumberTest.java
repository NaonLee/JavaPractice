package lamda;

public class MyNumberTest {

	public static void main(String[] args) {
		
		MyNumber maxNum = (x, y) -> (x >= y) ? x : y;	//skip the return, {} 
		//Anonymous class is created inside
		
		int max = maxNum.getMaxNumber(10, 20);
		System.out.println(max);
	}

}
