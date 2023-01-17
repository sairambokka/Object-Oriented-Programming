package ArrayListProblems;

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
		return "Book Details : id = " + id + ", Name = " + name + ", Author = " + author;
	}
	
}

public class BookDetails {

	public static void main(String[] args) {
		
		Book book1 = new Book("Concepts Of Physics", "H.C Varma");
		Book book2 = new Book("Objective Mathematics", "R.D Sharma");
		Book book3 = new Book("I Have A Dream", "Rashmi Bansal");
		
		ArrayList<Book> arrayListOfBooks = new ArrayList<>(Arrays.asList(book1, book2, book3));
		
		Iterator<Book> itr = arrayListOfBooks.iterator();
		
		System.out.println("--------BOOK DETAILS--------");
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
