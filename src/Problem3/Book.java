package Problem3;

public class Book extends Document {
    protected int numPages;
    protected String author;
    public  Book(int numPages, String author, String title) {
        super( title);
        this.numPages = numPages;
        this.author = author;
    }
    public int getNumPages() {
        return numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book{" + "numPages=" + numPages + ", author=" + author + '}';
    }
}
