package basicClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DynamicLoadingTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		
		for(Constructor c: cons) {			//show constructor information
			System.out.println(c);
		}
		
		Field[] fields = strClass.getFields();
		
		for(Field f : fields) {
			System.out.println(f);
		}
		
		Method[] methods = strClass.getMethods();
				
		for(Method m : methods) {
			System.out.println(m);
		}
	}

}
