package arrayPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraytList_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList_Student student1 = new ArrayList_Student("Lee");
		ArrayList_Student student2 = new ArrayList_Student("Kim");
		
		student1.enrollSubject("English", 100);
		student1.enrollSubject("Korean", 100);
		student1.showStudentInfo();
		
		student2.enrollSubject("English", 50);
		student2.enrollSubject("Korean", 55);
		student2.showStudentInfo();
		
		
		//change grade of Student1	-> If use ArrayList for students, you might be able to search studentID as well.
		int studentIDSearch;
		ArrayList<ArrayList_Subject> subject = new ArrayList<ArrayList_Subject>();
		String strSearch;
		
		System.out.print("Student id: ");
		studentIDSearch = sc.nextInt();
	
		if(studentIDSearch == student1.getStudentID()) {
			subject = student1.getSubjectList();
			
			System.out.print("Subject Name: ");
			strSearch = sc.next();
			
			for(ArrayList_Subject i : subject) {
				if((i.getName()).equals(strSearch)) {
					System.out.print("grade: ");
					int gr = sc.nextInt();
					i.setGrade(gr);
				}
				i.subjectInfo();
			}
		}
		student1.showStudentInfo();
		student2.showStudentInfo();
	}

}
