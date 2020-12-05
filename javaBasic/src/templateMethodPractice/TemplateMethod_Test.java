package templateMethodPractice;

public class TemplateMethod_Test {

	public static void main(String[] args) {

		TemplateMethod_Car car = new TemplateMethod_ManualCar();
		car.run();
		
		TemplateMethod_Car car2 = new TemplateMethod_AutoCar();
		car2.run();

	}

}
