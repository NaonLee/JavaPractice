package sort;

import java.util.ArrayList;
import java.util.List;

public class Quick_sort {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(22);
		list.add(6);
		list.add(62);
		list.add(1);
		list.add(5);
		
		System.out.println(quickSort(list));
	}
 
	public static List<Integer> quickSort(List<Integer> list){
		List<Integer> finalList = new ArrayList<Integer>();
		List<Integer> lowerList = new ArrayList<Integer>();
		List<Integer> heigherList = new ArrayList<Integer>();
		
		if(list.size() <= 1) {		//if the list has 0 or 1 element, return the original list (it doesn't need sorting)
			return list;
		}
		else {
			int pivot = list.get(0);			//pivot for sorting
			
			for(int element : list) {			//divide elements with pivot
				if(element < pivot) {
					lowerList.add(element);
				} 
				if(element > pivot){
					heigherList.add(element);
				}
			}
			
			finalList.addAll(quickSort(lowerList));			//Recursive function, the new pivots will be created
			finalList.add(pivot);							//add pivot(middle number)
			finalList.addAll(quickSort(heigherList));		//Recursive function with higher numbers
			return finalList;
		}
		
		
	}
}
