package basicClass;

class Book{
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "title: " + title + ", " + author;
	}
	
}
public class Object_toString {

	public static void main(String[] args) {
		
		Book book = new Book("java", "au");
		System.out.println(book);
		
		
	}
}
