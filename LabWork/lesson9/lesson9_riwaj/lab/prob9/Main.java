package lesson9.lab.prob9;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		Book book = new Book("test", 3);
		List<BookCopy> copies = book.getCopies();
		copies.forEach(copy->copy.changeAvailability());
		book.addCopy();
		
		//test
		System.out.println(book.isAvailable());
	}
}