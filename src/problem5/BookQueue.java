package problem5;

import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> queue;

    public BookQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(Book book) {
        queue.addLast(book);

    }

    public Book dequeue() {
        // code here and don't to test if it's empty
        Book book = queue.removeFirst();
        System.out.println("Dequeued: "+book);

        return book ;
    }

    public Book peek() {
        // code here and don't to test if it's empty
        Book book = queue.getFirst();
        System.out.println("Front: "+book);

        return book ;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        System.out.println("Queue contents (top to bottom):");
        for (Book book : queue) {
            System.out.println("- "+book);
        }

    }
}
