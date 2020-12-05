package interfacePolyphism;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		//R, L, P
		System.out.print("Please choose the way (R, L, P): ");
		int ch = System.in.read();
		
		Scheduler scheduler = null;
		if(ch == 'R' || ch == 'r') 
			scheduler = new RoundRobin();
		else if (ch == 'L' || ch == 'l')
			scheduler = new LeastJob();
		else if (ch == 'P' || ch == 'p')
			scheduler = new PriorityAllocation();
		else {
			System.out.println("Wrong input");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
