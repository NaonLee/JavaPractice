package collection.treeSet;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("f");
		tree.add("g");
		tree.add("e");
		tree.add("g");
		
		System.out.println(tree);		//in order, no duplication
	}

}
