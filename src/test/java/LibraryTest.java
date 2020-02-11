import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(3);
        book = new Book("Phil Stone", "JK", "fiction");
    }

    @Test
    public void library_starts_empty() {
        assertEquals(0, library.stockCount());
    }

    @Test
    public void add_book_to_library() {
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void cannot_add_book_to_library_as_its_full() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.stockCount());
    }
}
