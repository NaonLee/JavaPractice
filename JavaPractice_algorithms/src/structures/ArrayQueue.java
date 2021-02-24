package structures;

public class ArrayQueue {
	private int front;
	private int rear;
	private int maxSize;
	private Object[] queueArray;
	
	public ArrayQueue(int maxSize) {
		this.front = 0;
		this.rear = -1;
		this.maxSize = maxSize;
		queueArray = new Object[maxSize];
	}
	
	public boolean isEmpty() {
		return front == rear+1;
	}
	public boolean isFull() {
		return rear == maxSize-1;
	}
	
	public void insert(Object item) {
		queueArray[++rear] = item;
	}
	public Object peek() {
		if(isEmpty()) throw new ArrayIndexOutOfBoundsException();
		return queueArray[front];
	}
	public Object remove() {
		Object item = peek();
		front++;
		return item;
	}
}
