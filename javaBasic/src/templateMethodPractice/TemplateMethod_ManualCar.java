package templateMethodPractice;

public class TemplateMethod_ManualCar extends TemplateMethod_Car{

	@Override
	public void drive() {
		System.out.println("Human is driving");
		
	}

	@Override
	public void stop() {
		System.out.println("Human puts on the brake");
		
	}

	

}
