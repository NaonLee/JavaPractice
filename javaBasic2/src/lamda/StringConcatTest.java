package lamda;

public class StringConcatTest {

	public static void main(String[] args) {
		
		//General object
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "java");

		//Lambda
		StringConcat concat = (s1, s2) -> System.out.println(s1+ ", " + s2);
		concat.makeString("Hello", "Java");
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+ ", " + s2);
			}
		};
		
		concat2.makeString("hello", "java");
	}

}
