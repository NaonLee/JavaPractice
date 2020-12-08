package innerClass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{		//instance inner class
		int inNum = 200;
		//static int sInNum = 100;   
		//*static can't be defined inside of inner class since static have to be loaded on memory regardless of construction
		
		void inTest() {
			System.out.println(num);	//can use private variable of Outter class
			System.out.println(sNum);
		}
		//static void sTest() {}	*static
		}
	
	public void usingInTest() {
		inClass.inTest();
	}

	static class InStaticClass{			//static inner class
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10;		num can't be used, instance variable of outer class
			sNum += 10;			//static
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			System.out.println(sNum);
			//System.out.println(iNum);		instance variable
			System.out.println(sInNum);
		}
	}
}
public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingInTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		OutClass.InStaticClass.sTest();			//static

	}

}
