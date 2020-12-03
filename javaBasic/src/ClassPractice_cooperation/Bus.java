package ClassPractice_cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void taken(int money) {
		this.money += money;
		passengerCount++;
	}
	public void getoff() {
		passengerCount--;
	}
	
	public void showInfo() {
		System.out.println("Bus number" + busNumber + " has "+ passengerCount + " passengers and income is " + 
				money + "won.");
	}
}
