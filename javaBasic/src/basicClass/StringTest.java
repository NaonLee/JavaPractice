package basicClass;

public class StringTest {
	
	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);				//two addresses are the different.
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4);				//Same addresses
		
		//String is immutable, if use concat a lot, two many GC will be created ->overhead
		//-> the reason why we're using StringBuilder, StringBuffer
		
		//Single thread - StringBuilder
		//Multiple thread = StringBuffer
	}

}
