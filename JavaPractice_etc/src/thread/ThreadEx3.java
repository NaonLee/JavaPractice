package thread;

public class ThreadEx3 {

	public static void main(String[] args) {
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run();
	}

}

class ThreadEx3_1 extends Thread{
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*result
 * java.lang.Exception
	at thread.ThreadEx3_1.throwException(ThreadEx3.java:19)
	at thread.ThreadEx3_1.run(ThreadEx3.java:14)
	at thread.ThreadEx3.main(ThreadEx3.java:7)
	Included main method
*/