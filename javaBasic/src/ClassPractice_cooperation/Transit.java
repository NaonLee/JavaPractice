package ClassPractice_cooperation;

public class Transit {

	public static void main(String[] args) {
		Bus bus1112 = new Bus(1112);
		Subway subway12 = new Subway(12);
		
		Student Naon = new Student("Naon", 2, 30000);
		Student Poo = new Student("Poo", 3, 50000);
		
		
		Naon.showInfo();
		Naon.GetonBus(bus1112);
		Naon.GetOnSubway(subway12);
		Naon.showInfo();
		bus1112.showInfo();
		subway12.showInfo();
		
		Naon.GetOffBus(bus1112);
		bus1112.showInfo();
	}

}
