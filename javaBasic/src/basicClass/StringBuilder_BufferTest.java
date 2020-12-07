package basicClass;

public class StringBuilder_BufferTest {

	public static void main(String[] args) {

		String str1 = new String("java");
		
		System.out.println(System.identityHashCode(str1));
		
		StringBuilder buffer = new StringBuilder(str1);
		System.out.println(System.identityHashCode(buffer));

		buffer.append(" and ");
		buffer.append("C++");
		System.out.println(System.identityHashCode(buffer));	//different from String, append doesn't create instance
		
		
		String str2 = buffer.toString();
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));
		
		
		//Wapper
		Integer num1 = new Integer(100);		//not using anymore (new Integer)
		int num2 = 200;
		int sum = num1 + num2;		//num1.intValue() - unboxing
		Integer num3 = num2;		//Integer.valueOf(num2) - autoboxing
	}

}
