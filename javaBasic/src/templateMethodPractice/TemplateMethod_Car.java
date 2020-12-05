package templateMethodPractice;

public abstract class TemplateMethod_Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void washCar() {}
	
	public void startCar() {
		System.out.println("Start a car");
	}
	public void turnOff() {
		System.out.println("Turn off the engine");
	}
	
	public final void run() {		//Template method
		startCar();
		drive();
		stop();
		washCar();
		turnOff();
	}
}
