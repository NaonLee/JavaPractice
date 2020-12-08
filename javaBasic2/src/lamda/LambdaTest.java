package lamda;

interface PrintString{
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {


		PrintString lambdaPrint = str -> System.out.println(str);		//변수 대입 후 바로 implementation
		lambdaPrint.showString("test");
		
		showMyString(lambdaPrint);
		
		PrintString reStr = returnPrint();
		reStr.showString("hello");
	}
	
	public static void showMyString(PrintString lambda) {				//구현된 내용 자체가 매개변수
		lambda.showString("test2");
	}

	public static PrintString returnPrint() {							//구현 내용 자체를 반환
		return s -> System.out.println(s + " world");
	}
}
