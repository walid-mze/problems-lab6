package Problem3;

public class Document {
    protected int numRec;
    protected String title;
    private static int count=0;
    public  Document( String title) {
        this.numRec = ++count;
        this.title = title;
        count++;
    }
    public int getNumRec() {
        return numRec;
    }
    public void setNumRec(int numRec) {
        this.numRec = numRec;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Document{" + "numRec=" + numRec + ", title=" + title + '}';
    }
}
