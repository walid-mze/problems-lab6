package Problem3;

import java.util.Scanner;
public class Main {
void main() {
    System.out.print("Enter the number of documents: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    Library lib = new Library(n);

    lib.addDocument(new Novel("Harry Potter", "owling", 350, 120.0));
    lib.addDocument(new TextBook("Java Programming", "Gosling", 500, "intermediate"));

    int choice = 0;
    do {
        System.out.println("\n===== LIBRARY MENU =====");
        System.out.println("1. Add Document");
        System.out.println("2. Delete Document");
        System.out.println("3. Display Documents");
        System.out.println("4. Display Authors");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:

                System.out.print("Enter the type of the document: ");
                System.out.println("1=Novel, 2=Textbook, 3=Magazine, 4=Dictionary):");
                int type=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the title of the document: ");
                String title=sc.nextLine();
                Document doc=null;
                if (type==1){
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Pages: ");
                    int pages = sc.nextInt();
                    System.out.print("price: ");
                    double price=sc.nextDouble();
                     doc = new Novel(title, author, pages, price);
                }
                else if (type==2){
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Pages: ");
                    int pages = sc.nextInt();
                    System.out.print("level: ");
                    String level = sc.nextLine();
                     doc = new TextBook(title, author, pages, level);

                }
                else if (type==3){
                    System.out.print("Month: ");
                    String month = sc.nextLine();
                    System.out.print("Year: ");
                    int year = sc.nextInt();
                     doc = new Magazine(title, month,year);

                }
                else if (type==4){
                    System.out.print("Language: ");
                    String lang = sc.nextLine();
                     doc = new Dictionary(title, lang);

                }
                if (doc!=null){
                    lib.addDocument(doc);

                }
                break;
            case 2:
                System.out.print("Enter the num of record  of the document: ");
                int num = sc.nextInt();
                sc.nextLine();
                Document docc=lib.document(num);
                if (docc!=null){
                    lib.delete(docc);
                }
                else{
                    System.out.println("No such document");
                }
                break;
            case 3:
                lib.displayDocuments();
                break;
            case 4:
                lib.displayAuthors();
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice");


        }
    }
    while (choice!=5);
}}