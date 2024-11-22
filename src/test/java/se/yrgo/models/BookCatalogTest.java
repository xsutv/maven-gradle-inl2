package se.yrgo.models;

import org.junit.jupiter.api.Test;
import se.yrgo.models.Book;
import se.yrgo.models.BookCatalog;
import se.yrgo.models.BookNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class BookCatalogTest {

    private BookCatalog bc;

    public BookCatalogTest() {
        bc = new BookCatalog();
        Book book1 = new Book(1, "Salem", "", "", "", 0);
        bc.addBook(book1);
    }

    //G
    @Test
    public void testAddABook() {
        Book book2 = new Book(2, "Herman", "", "", "", 0);
        bc.addBook(book2);
        assertEquals(2, bc.getNumberOfBooks());
    }

    //G
    @Test
    public void testFindBook() {
        try {
            Book book3 = new Book(3, "Falafel", "", "", "", 0);
            bc.addBook(book3);
            assertEquals(book3, bc.findBook("Falafel"));
        } catch (BookNotFoundException e) {
            System.out.println("Book not found.");
        }
    }

    //G
    @Test
    public void testFindBookIgnoringCase() {
        try {
            Book book3 = new Book(3, "Falafel", "", "", "", 0);
            bc.addBook(book3);
            assertEquals(book3, bc.findBook("FALAFEL"), "Success");
        } catch (BookNotFoundException e) {
            System.out.println("Book not found. Ignore case test.");
        }
    }

    //G
    @Test
    public void testFindBookWithExtraSpaces() {
        try {
            Book book4 = new Book(3, "Falafel", "", "", "", 0);
            bc.addBook(book4);
            assertEquals(book4, bc.findBook("    Falafel   "));
        } catch (BookNotFoundException e) {
            System.out.println("Book not found. Extra spaces test.");
        }

    }

    //VG
    // This test should throw BookNotFoundException in order to pass.
    @Test
    public void testFindBookThatDoesntExist() {
        assertThrows(BookNotFoundException.class, () -> bc.findBook("Falem"));
    }

}
