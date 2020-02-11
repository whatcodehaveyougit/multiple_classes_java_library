import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("Chamber Secrets", "JK Rowling", "Fiction");
    }

    @Test
    public void book_has_title() {
        assertEquals("Chamber Secrets", book.getTitle());
    }

    @Test
    public void book_has_author() {
        assertEquals("JK Rowling", book.getAuthor());
    }

    @Test
    public void book_has_genre() {
        assertEquals("Fiction", book.getGenre());
    }


}
