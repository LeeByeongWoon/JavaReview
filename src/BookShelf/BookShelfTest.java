package BookShelf;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelves();
        bookQueue.enQueue("책1");
        bookQueue.enQueue("책2");
        bookQueue.enQueue("책3");
        bookQueue.enQueue("책4");
        bookQueue.enQueue("책5");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
