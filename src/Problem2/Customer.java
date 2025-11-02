package Problem2;

import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Double> transactions;

    public Customer(String name, ArrayList<Double> items) {
        this.name = name;
        this.transactions = items;
    }
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public boolean credit(double amount) {
        if (amount < 0) {
            return false;
        }
        transactions.add(amount);
        return true;
    }
    public boolean debit(double amount) {
        if (amount < 0) {
            return false;
        }
        transactions.add((-1)*amount);
        return  true;
    }

}
