package ClassPractice;

public class ReferenceTest {

	public static void main(String[] args) {
		ReferenceStudent Naon = new ReferenceStudent(1, "Naon");
		Naon.setEnglishClass(100);
		Naon.setMathClass(99);
		
		ReferenceStudent Poo = new ReferenceStudent(2, "Poo");
		Poo.setEnglishClass(55);
		Poo.setMathClass(66);
		
		Naon.showStudentInfo();
		Poo.showStudentInfo();
	}

}
