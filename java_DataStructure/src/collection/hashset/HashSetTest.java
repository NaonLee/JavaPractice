package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("a");
		System.out.println(b1);
		set.add("b");
		set.add("c");
		
		System.out.println(set);
		boolean b2 = set.add("a");				//duplication is not allowed
		System.out.println(b2);
	}

}
