package structures;

import java.util.EmptyStackException;
import java.util.Vector;

//Stack is given in Java. However, to understand the structure of Stack, I will make my own stack class
public class Stack extends Vector{
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	
	public Object pop() {
		Object obj = peek();		//search the last item
		removeElement(size() -1);	//get the last item's index and remove it
		return obj;
	}
	
	public Object peek() {
		int length = size();
		if(length == 0) 	//if the stack is empty
			throw new EmptyStackException();		//throws Exception
		return elementAt(length-1);					//The last item's index
		
	}
	
	public boolean empty() {
		return size() == 0;				
	}
	
	public int search(Object obj) {
		int index = lastIndexOf(obj);		//search an item's index from the last to the first
		if (index >= 0)						
			return size() - index;			//if there is the item's index
		return -1;							//if there isnt' the item, return -1
	}
	
	
}
