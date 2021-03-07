package thread;

//Single thread
public class ThreadEx4 {

	public static void main(String[] args) {
		long stTime = System.currentTimeMillis();
		
		for(int i=0; i<500; i++)
			System.out.print(new String("A"));
		System.out.println();
		System.out.println("Duration of time: " + (System.currentTimeMillis()-stTime));
		
		for(int i=0; i<500; i++)
			System.out.print(new String("B"));
		System.out.println();
		System.out.println("Duration of time 2: " + (System.currentTimeMillis()-stTime));
	}

}
