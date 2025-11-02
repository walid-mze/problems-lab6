package Problem2;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Bank bank=new Bank("Wafa Bank", new ArrayList<>());

        Customer Sami=new Customer("Sami", new ArrayList<>());
        Customer Yassine=new Customer("Yassine", new ArrayList<>());

        bank.addCustomer(Sami);
        bank.addCustomer(Yassine);

        bank.addTransaction(1000,Sami);  // Credit
        bank.addTransaction(-200, Sami);  // Debit
        bank.addTransaction(500, Yassine);

        bank.printStatements();
    }
}