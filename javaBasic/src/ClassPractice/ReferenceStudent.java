package ClassPractice;

public class ReferenceStudent {
	private int studentId;
	private String studentName;
	private ReferenceSubject mathClass;
	private ReferenceSubject englishClass;
	
	public ReferenceStudent() {
		mathClass = new ReferenceSubject("Math");
		englishClass = new ReferenceSubject("English");
	}
	
	public ReferenceStudent(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		mathClass = new ReferenceSubject("Math");
		englishClass = new ReferenceSubject("English");
	}
	
	public void setMathClass(int grade) {
		mathClass.setGrade(grade);
	}
	public void setEnglishClass(int grade) {
		englishClass.setGrade(grade);
	}
	
	public void showStudentInfo() {
		int totalGrade = mathClass.getGrade() + englishClass.getGrade();
		System.out.println(studentName + "의 총점은 " + totalGrade + "점 입니다.");
	}
}
