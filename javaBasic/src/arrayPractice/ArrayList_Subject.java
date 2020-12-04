package arrayPractice;

public class ArrayList_Subject {

	private String name;
	private int grade;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void subjectInfo() {
		System.out.println(name + " greade: " + grade);
	}
}
