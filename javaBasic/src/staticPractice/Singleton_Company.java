package staticPractice;

public class Singleton_Company {

	private static Singleton_Company instance = new Singleton_Company();
	
	private Singleton_Company() {}
	
	public static Singleton_Company getInstance() {
		if(instance == null)								//if there is no instance created,
			instance = new Singleton_Company();
		return instance;
	}
}
