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

    public int countBooksBorrowed() {
        return this.borrowedItems.size();
    }

    public void borrowBook(Book book) {
        this.borrowedItems.add(book);
    }

    public void borrowerTakesBookFromLibrary(Library library) {
        if(this.countBooksBorrowed() < this.borrowLimit && library.stockCount() > 0) {
            this.borrowedItems.add(library.bookLeavesLibrary());
        }
    }


}
