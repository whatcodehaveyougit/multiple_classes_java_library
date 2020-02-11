import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }

    public int stockCount() {
        // Stock is a property of lib so we can access it. a library instance method is being passed in
        // and accessed it with this.
        return this.stock.size();
    }

    public boolean isStockFull() {
        if(this.stock.size() < this.capacity) {
            return true;
        } else {
            return false;
        }
    }

    public void addBook(Book book) {
        if (this.isStockFull()) {
            this.stock.add(book);
        }
    }

    public Book bookLeavesLibrary() {
        return this.stock.remove(0);
    }
}
