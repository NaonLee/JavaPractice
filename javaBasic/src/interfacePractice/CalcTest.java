package interfacePractice;

public class CalcTest {

	public static void main(String[] args) {

		Calc calc = new CompleteCalc();
		System.out.println(calc.add(2, 3));
		
		calc.description();
		
		int[] arr = {1,2,3};
		System.out.println(Calc.total(arr));			//static can be called by Cacl
	}

}
