package problem5;
public class Main{
    public static void main(String[] args) {
        BookStack bookStack = new BookStack();
        bookStack.push(new Book("The Hobbit","J.R.R. Tolkien",1937));
        bookStack.push(new Book("1984","George Orwell",1949));
        bookStack.push(new Book("Clean Code","Robert C. Martin",2008));

        System.out.println("=== Stack Test ===");
        bookStack.display();
        bookStack.pop();
        bookStack.peek();
        bookStack.display();

        BookQueue bookQueue = new BookQueue();
        bookQueue.enqueue(new Book("The Hobbit","J.R.R. Tolkien",1937));
        bookQueue.enqueue(new Book("1984","George Orwell",1949));
        bookQueue.enqueue(new Book("Clean Code","Robert C. Martin",2008));

        System.out.println("\n");

        System.out.println("=== Queue Test ===");
        bookQueue.display();
        bookQueue.dequeue();
        bookQueue.peek();
        bookQueue.display();


    }
}