package CollectionsDemo;

import java.util.*;

class Book{
	private int id;
	private String name;
	private String author;
	private static int idGen = 100;
	
	
	public Book(String name, String author) {
		super();
		this.id = ++idGen;
		this.name = name;
		this.author = author;
	}
	
	public Book() {
		super();
		this.id = ++idGen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book Details :" + " Name -> " + name + ", Author -> " + author;
	}
}

public class BookDetails {

	public static void main(String[] args) {
		
		Book book1 = new Book("Concepts Of Physics", "H.C Varma");
		Book book2 = new Book("Objective Mathematics", "R.D Sharma");
		Book book3 = new Book("I Have A Dream", "Rashmi Bansal");
		
		Map<Integer, Book> bookMap = new HashMap<>();
		
		Book[] books = {book1, book2, book3};
		
		for(Book book : books)
		{
			bookMap.put(book.getId(), book);
		}
		
		for(Map.Entry<Integer, Book> es : bookMap.entrySet())
		{
			System.out.println(es.getKey() + " " +es.getValue());
		}
	}

}
