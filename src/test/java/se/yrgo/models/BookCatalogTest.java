package se.yrgo.models;

import org.junit.jupiter.api.Test;
import se.yrgo.models.Book;
import se.yrgo.models.BookCatalog;
import se.yrgo.models.BookNotFoundException;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		Book book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {

	}

	//G
	@Test
	public void testFindBook() {

	}

	//G
	@Test
	public void testFindBookIgnoringCase() {

	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() {

	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {

	}

}
