package abstractPractice;

public abstract class Phone {
	public abstract void display();
	public abstract void call();
	
	public void turnOn() {
		System.out.println("Power on");
	}
	
	public void turnOff() {
		System.out.println("Power off");
	}
}
