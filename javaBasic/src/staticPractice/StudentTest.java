package staticPractice;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("num: " + Student.getNum());		
															//As num is private, use getter
		Student st1 = new Student();
		Student st2 = new Student();
		
		System.out.println("student1 ID: " + st1.studentID);
		System.out.println("student2 ID: " + st2.studentID);

		//static value is the same
		System.out.println("student1 num: " + st1.getNum());		//usually use class name to reference a static variable
		System.out.println("student2 num: " + st2.getNum());
	}

}
