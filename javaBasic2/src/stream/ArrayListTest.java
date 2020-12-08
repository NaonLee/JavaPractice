package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		
		sList.add("Lee");
		sList.add("Kim");
		sList.add("Im");
		
		Stream<String> sStream = sList.stream();
		sStream.forEach(s -> System.out.println(s));
		
		/* Same as
		 for(String s : sList){
		 System.out.println(s)
		 */
		

		sList.stream().sorted().forEach(s -> System.out.println(s));		//print sorted list
	}

}
