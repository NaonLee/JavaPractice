package basicClass;

class Point {
	int x;
	int y;
	public Point(int x, int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "x-" + x + ", y-" + y;
	}
}	
class Circle implements Cloneable {							//Cloneable for clone
	Point point;
	private int radius;
	public Circle(int x, int y, int radius) {
		point = new Point(x,y);
		this.radius = radius;
	}
	
	public String toString() {
		return "x, y is " + this.point + ", radius is " + radius;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
	

public class Object_clone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10, 20, 5);
		Circle cloneCircle = (Circle)circle.clone();		//down cast
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cloneCircle));
		
		System.out.println(circle);
		System.out.println(cloneCircle);
	}

}
