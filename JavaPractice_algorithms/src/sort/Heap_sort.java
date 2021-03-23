package sort;

import java.util.Random;

public class Heap_sort {

	public static void main(String[] args) {
		int[] arr = {5,8,4,7,10,9,2,1,6,3};

		//Max heap
		for(int i = arr.length/2-1; i >= 0; i--) {		//start with a parent node of the last node
			heapify(arr, arr.length, i);
		}
		
		//Heap sort
		for(int i= arr.length-1; i >= 0; i--) {			//start with the last node's index
			swap(arr, i, 0);							//swap the last node and the root node
			heapify(arr, i, 0);							//make Max heap again (pivot will be the root node)
		}
		 
		for(int i = 0; i < arr.length; i++) {	
			System.out.print(arr[i] + " ");
		}
	}

	public static void heapify(int[] arr, int size, int pNode) {
		int parent = pNode;		//parent of the last node
		int leftNode = parent * 2 + 1;		//left node of parent
		int rightNode = parent * 2 + 2;		//right node
		
		// ' < size' -> check if it's larger than an array index
		if(leftNode < size && arr[parent] < arr[leftNode])
			parent = leftNode;
		if(rightNode < size && arr[parent] < arr[rightNode])
			parent = rightNode;
	
		if(parent != pNode)	{			//if they have different values, the parent node has smaller value than child's
			swap(arr, parent, pNode);
			heapify(arr, size, parent);		//check if the swap effect the others
		}
		
	}
	
	//swap
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	
}
