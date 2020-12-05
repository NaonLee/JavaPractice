package interfacePolyphism;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Bring call from queue");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Assign a call to agent having empty jobList");
		
	}

}
