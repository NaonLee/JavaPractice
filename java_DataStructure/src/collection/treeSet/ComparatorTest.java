package collection.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest implements Comparator<String>{

	
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>(new ComparatorTest());		//put constructor->use comparator
		
		tree.add("a");
		tree.add("b");
		tree.add("c");
		
		System.out.println(tree);
		
	}

	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2) * -1;				//descending
	}

}
