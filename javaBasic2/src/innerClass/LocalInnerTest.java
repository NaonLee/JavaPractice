package innerClass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	
	
	public Runnable getRunnerable(int i){			//Runnable: interface for thread construction
		
		int localNum = 100;
		
		return new Runnable() {				//inner anonymous class
			@Override
			public void run() {
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
		};
		
		
		
		/* class MyRunnable implements Runnable{		//local inner class

			@Override
			public void run() {
				//localNum += 100;			final local variable can't be changed
				//i += 200;
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
			
		}*/
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {


		Outer outer = new Outer();
		Runnable runner = outer.getRunnerable(30);
		runner.run();
	}

}
