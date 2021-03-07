package thread;

//Multi threads
public class ThreadEx5 {
	static long stTime = 0;
	public static void main(String[] args) {
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();
		stTime = System.currentTimeMillis();
		
		for(int i=0; i<500; i++)
			System.out.print(new String("A"));
		System.out.println();
		System.out.println("Duration of time 1: " + (System.currentTimeMillis()-ThreadEx5.stTime));

	}

}

class ThreadEx5_1 extends Thread{
	public void run() {
		for(int i=0; i<500; i++)
			System.out.print(new String("B"));
		System.out.println();
		System.out.println("Duration of time 2: " + (System.currentTimeMillis()-ThreadEx5.stTime));
	}
}

//Duration times are close since two threads was working in turn
