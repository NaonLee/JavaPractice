package arrayPractice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("sdf");
		strList.add("wer");
		strList.add("bsdb");
		
		for(String s: strList)
			System.out.println(s);
		
		for(int i = 0; i < strList.size(); i++)
			System.out.println(strList.get(i));
	}

}
