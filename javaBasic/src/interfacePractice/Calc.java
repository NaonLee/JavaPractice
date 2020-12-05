package interfacePractice;

public interface Calc {
	double PI = 3.14;
	int ERROR = -99999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {					//default method, can be overrided
		System.out.println("Create Calculator");
	}
	
	static int total(int[] arr) {					//static method
		int total = 0;
		
		for(int i :arr)
			total += i;
		return total;
	}
	
	
}
