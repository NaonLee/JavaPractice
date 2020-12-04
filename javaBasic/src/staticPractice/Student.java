package staticPractice;

public class Student {
	int studentID;
	String studentName;
	private static int num = 1000;
	
	public Student() {
		num++;
		
	}

	public static int getNum() {
		int i =10;							//local variable test
		i++;		
		
		System.out.println(i);
		
		//studentName='real';				//you can't use instant variable inside of static since it's not created yet
		return num;
	}

}
