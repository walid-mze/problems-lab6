package Problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;
    public Library(int capacity) {
        this.capacity = capacity;
        this.documents=new ArrayList<>();
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "Library{" +
                "capacity=" + capacity +
                '}';
    }
    public void displayDocuments(){
        if (documents.isEmpty()){
            System.out.println("No documents available");
        }
        for (int i=0;i<documents.size();i++){
            System.out.println(documents.get(i));
        }

    }
    public boolean addDocument(Document document){
        if (documents.size()<capacity ){
            documents.add(document);
            return true;
        }
        return false;
    }
    public boolean delete(Document document){
            return documents.remove(document);
    }
    public Document document(int numEnrg){
        for (Document document : documents){
            if (document.getNumRec()==numEnrg){
                return document;
            }
        }
        return null;
    }

    public void displayAuthors(){
        System.out.println("Authors of all books:");
        for  (Document document : documents){
            if (document instanceof Book){
                System.out.println(((Book) document).getAuthor());
            }
        }
    }

}
