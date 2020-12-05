package interfaceInheritance;

public class MyClass implements MyInterface {

	@Override
	public void x() {
		System.out.println("X");
	}

	@Override
	public void y() {
		System.out.println("Y");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod");
	}

	public static void main(String[] args) {
		
		MyClass myClass = new MyClass();
		myClass.myMethod();
		
		X x = myClass;				//Depends on inheritance type
		x.x();
		Y y = myClass;
		y.y();
		
		
	}
}
