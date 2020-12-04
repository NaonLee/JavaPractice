package arrayPractice;

public class BookTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		library[0] = new Book("Book1", "author1");
		library[1] = new Book("Book2", "author2");
		library[2] = new Book("Book3", "author3");
		library[3] = new Book("Book4", "author4");
		library[4] = new Book("Book5", "author5");
		
		for(int i  = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		for(int i  = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}

		//Shallow copy: copy and paste ADDRESS of array
		//if original value is changed, copied array value will be changed as well
		
		Book[] largeLibrary = new Book[10];
		
		System.arraycopy(library, 0, largeLibrary, 1, 4);
		System.out.println("Shallow copy");
		for(int i  = 0; i < largeLibrary.length; i++) {
			if(largeLibrary[i] != null)							//index 0, 5~9 is null
				largeLibrary[i].showBookInfo();
		}														
		
		//Deep copy
		System.out.println("Deep copy");
		
		Book[] largeLibrary2 = new Book[10];
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(i);
			largeLibrary2[i] = new Book();
			largeLibrary2[i].setBookName(library[i].getBookName());
			largeLibrary2[i].setAuthor(library[i].getAuthor());
		}
		for(int i = 0; i < largeLibrary2.length; i++) {
			if(largeLibrary2[i] != null)	
				largeLibrary2[i].showBookInfo();
		}
		
		//Enhanced for
		
		String[] strArr = {"asd", "ggg", "gew"};
		
		for(String s : strArr) {
			System.out.println(s);
		}
	}
	
}
