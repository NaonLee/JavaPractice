package bookStore_interfacePractice;

public class ShelfTest {

	public static void main(String[] args) {
		
				Queue shelfQueue = new BookShelf();
				shelfQueue.enQueue("A");
				shelfQueue.enQueue("B");
				shelfQueue.enQueue("C");
				shelfQueue.enQueue("D");
				
				System.out.println(shelfQueue.deQueue());
	}

}
