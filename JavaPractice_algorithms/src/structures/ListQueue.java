package structures;

public class ListQueue {
	
	private class Node{
		private Object data;
		private Node nextNode;
		
		public Node(Object data) {
			this.data = data;
			this.nextNode = null;
		}
	}
	
	private Node front;
	private Node rear;
	
	public ListQueue() {
		this.front = null;
		this.rear = null;
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public void insert(Object item) {
		Node newNode = new Node(item);
		newNode.nextNode = null;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.nextNode = newNode;
			rear = newNode;
		}
	}
	
	public Object peek() {
		if(isEmpty()) throw new ArrayIndexOutOfBoundsException();
		return front.data;
	}
	
	public Object remove() {
		Object item = peek();
		front = front.nextNode;
		if(front == null) rear = null;		//if the front is null, that means there was only one node in the queue
		return item;
	}
}
