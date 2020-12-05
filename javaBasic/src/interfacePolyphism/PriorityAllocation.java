package interfacePolyphism;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Bring loyal customer's call first");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Assign a call to agent having higheset skill level");
		
	}

}
