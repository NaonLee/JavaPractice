package ClassPractice_cooperation;

public class Student {
	String studentName;
	int year;
	int money;
	
	public Student(String studentName, int year, int money) {
		super();
		this.studentName = studentName;
		this.year = year;
		this.money = money;
	}
	
	public void GetonBus(Bus bus) {
		bus.taken(1000);
		money -= 1000;
	}
	
	public void GetOnSubway(Subway subway) {
		subway.taken(1200);
		money -= 1200;
	}
	public void GetOffSubway(Subway subway) {
		subway.getoff();
	}
	public void GetOffBus(Bus bus) {
		bus.getoff();
	}
	public void showInfo() {
		System.out.println(studentName + " has " + money + "won.");
	}
}
