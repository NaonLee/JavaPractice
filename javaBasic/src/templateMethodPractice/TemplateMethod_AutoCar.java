package templateMethodPractice;

public class TemplateMethod_AutoCar extends TemplateMethod_Car {

	@Override
	public void drive() {
		System.out.println("Automatically starts an engine");
		
	}

	@Override
	public void stop() {

		System.out.println("Automatically puts on the brake");
	}

}
