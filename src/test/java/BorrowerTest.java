import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;
    private Book rentedBook;

    @Before
    public void before() {
        borrower = new Borrower(3);
        book = new Book("Goblet Fire", "JK", "Fiction");
        library = new Library(3);
    }

    @Test
    public void check_borrow_limit() {
        assertEquals(3, borrower.getBorrowLimit());
    }
    @Test
    public void borrower_starts_with_zero_books_borrowed() {
        assertEquals(0, borrower.countBooksBorrowed());
    }

    @Test
    public void borrow_can_borrow_book() {
        borrower.borrowBook(book);
        assertEquals(1, borrower.countBooksBorrowed());
    }


    @Test
    public void borrower_takes_book_from_library() {
        library.addBook(book);
        borrower.borrowerTakesBookFromLibrary(library);
        assertEquals(0, library.stockCount());
        assertEquals(1, borrower.countBooksBorrowed());
    }
}
