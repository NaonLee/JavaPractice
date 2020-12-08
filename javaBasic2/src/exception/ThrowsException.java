package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);		//throws: back off exception
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

		ThrowsException ex = new ThrowsException();
		try {
			ex.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {						//catch exception thrown from loadClass
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {									//최상위 클래스인 Exception e 는 가장 마지막에
			System.out.println(e);
		}
		System.out.println("end");

	}

}

//!!!! throw and throws are different