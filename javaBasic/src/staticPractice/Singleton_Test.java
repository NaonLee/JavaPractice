package staticPractice;

import java.util.Calendar;

public class Singleton_Test {

	public static void main(String[] args) {
		//Singleton_Company company = new Singleton_Company();    //constructor is private

		Singleton_Company c1 = Singleton_Company.getInstance();
		Singleton_Company c2 = Singleton_Company.getInstance();
		
		System.out.println("c1 address: " + c1);				//addresses will be the same
		System.out.println("c1 address: " + c2);
		
		Calendar cal = Calendar.getInstance();					//singleton
		
		System.out.println(cal.getTime());
	}

}
