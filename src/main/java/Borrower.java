import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedItems;
    private int borrowLimit;

    public Borrower(int borrowLimit) {
        this.borrowLimit = borrowLimit;
        this.borrowedItems = new ArrayList<Book>();
    }

    public int getBorrowLimit() {
        return  this.borrowLimit;
    }

    public Object countBooksBorrowed() {
        return this.borrowedItems.size();
    }

    public void takesBookFromLibrary(Book rentedBook) {
        this.borrowedItems.add(rentedBook);
    }


}
