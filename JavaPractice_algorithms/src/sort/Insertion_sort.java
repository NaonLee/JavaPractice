package sort;

public class Insertion_sort {

	public static void main(String[] args) {
		int[] list = {8,22,51,6,2,4,1};
		int[] result = insertion_sort(list, list.length);
	
		for(int i:result) {
			System.out.print(i + " ");
		}
	}

	public static int[] insertion_sort(int list[], int size) {
		int key, j;
		for(int i=1; i<size; i++) {
			key = list[i];
			for(j=i-1; j>=0 && list[j]>key; j--) {
				list[j+1] = list[j];
			}
			list[j+1] = key;
		}
		return list;
	}
}
