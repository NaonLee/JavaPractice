package arrayPractice;

import java.util.ArrayList;

public class ArrayList_Student {

	private int studentID;
	private String studentName;
	private ArrayList<ArrayList_Subject> subjectList;
	private static int num = 1000;
	
	public ArrayList_Student(String studentName) {
		this.studentID = num;
		num++;
		this.studentName = studentName;
		subjectList = new ArrayList<ArrayList_Subject>();
	}
	
	public void enrollSubject(String name, int grade) {
		ArrayList_Subject subject = new ArrayList_Subject();
		subject.setGrade(grade);
		subject.setName(name);
	
		subjectList.add(subject);
	}
	
	public ArrayList<ArrayList_Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<ArrayList_Subject> subjectList) {
		this.subjectList = subjectList;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void showStudentInfo() {
		for(ArrayList_Subject subject : subjectList) {
			System.out.println("Student " + studentName + "(" + studentID + ") - Subject " +
					subject.getName() + ": "+ subject.getGrade());
		}
	}
}
