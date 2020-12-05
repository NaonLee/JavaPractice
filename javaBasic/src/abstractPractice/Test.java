package abstractPractice;

public class Test {

	public static void main(String[] args) {

		//Phone p1 = new Phone();			//error, abstract class
		
		Phone p1 = new Galaxy();
		//Phone p2 = new IPhone();			//error, abstract class
		
		Phone p3 = new Mini12();
		IPhone p4 = new Mini12();
		
		p1.display();
		p4.display();
	}

}
