package basicClass;

class Student{
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentID == std.studentID)
				return true;
			else return false;
		}
		else return false;
	}

	@Override
	public int hashCode() {
		return studentID;
	}
	
	
	
	
	
}

public class Object_equals {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2);				//compare addresses
		
		System.out.println(str1.equals(str2));			//compare value
		
		Student std1 = new Student(1001, "Mas");
		Student std2 = new Student(1001, "Mas");

		System.out.println(std1 == std2);				//compare addresses
		
		System.out.println(std1.equals(std2));			//compare value (Override equals)->hashCode also should be overrided
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());	
		System.out.println(System.identityHashCode(str1));		//original hash code before overriding
		System.out.println(System.identityHashCode(str2));		//original hash code before overriding
		
		//if two instances are the same logically, hash codes should be the same
		
		System.out.println(std1.hashCode());	
		System.out.println(std2.hashCode());	
	}

}
