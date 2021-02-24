package structures;


public class ListStack {
	
	private Node top;
	
	public class Node{					//Node structure
		private Object data;
		private Node nextNode;
		
		Node(Object data){				
			this.data = data;
			this.nextNode = null;
		}
	}
	
	public ListStack() {
		this.top = null;
	}
	
	public boolean isEmpty() {
		return this.top == null;
	}
	
	public void push(Object item) {
		Node newNode = new Node(item);
		newNode.nextNode = top;
		top = newNode;
	}
	public Object peek() {
		if(isEmpty()) throw new ArrayIndexOutOfBoundsException();
		return top.data;
	}
	public Object pop() {
		Object item = peek();
		top = top.nextNode;
		return item;
	}
	
	

}
