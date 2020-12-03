package ClassPractice_cooperation;

public class Subway {
	int subwayNumber;
	int passengerCount;
	int money;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void taken(int money) {
		this.money += money;
		passengerCount++;
	}
	public void getoff() {
		passengerCount--;
	}
	public void showInfo() {
		System.out.println("Bus number" + subwayNumber + " has "+ passengerCount + " passengers and income is " + 
				money + "won.");
	}
}
