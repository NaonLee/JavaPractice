package thread;

//Create Exception in purpose
public class ThreadEx2 {
	public static void main(String[] args) throws Exception {
		ThreadEx2_1 t1 = new ThreadEx2_1();
		t1.start();
	}
	
}

class ThreadEx2_1 extends Thread {
	public void run() {
		throwException();
	}
	public void throwException() {
		try {
			throw new Exception();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

/*result
 * java.lang.Exception
 *	at thread.ThreadEx.throwException(ThreadEx2.java:17)
 *	at thread.ThreadEx.run(ThreadEx2.java:13)
 *Fist method is run() not main. Main thread has already ended
*/