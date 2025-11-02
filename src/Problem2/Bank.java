package Problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    // Constructor
    public Bank(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = (customers != null) ? customers : new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public boolean addCustomer(Customer customer) {
        for (Customer c : customers) {
            if (c.getName().equalsIgnoreCase(customer.getName())) {
                System.out.println("Customer " + customer.getName() + " already exists!");
                return false;
            }
        }
        customers.add(customer);
        System.out.println("Customer added: " + customer.getName());
        return true;
    }

    public boolean addTransaction(double amount, Customer customer) {
        for (Customer c : customers) {
            if (c.getName().equalsIgnoreCase(customer.getName())) {
                // Credit if positive, debit if negative
                if (amount >= 0) {
                    return c.credit(amount);
                } else {
                    return c.debit(-amount);
                }
            }
        }
        System.out.println("Customer not found: " + customer.getName());
        return false;
    }

    public void printStatements() {
        System.out.println("\nBank: " + name + " - Customer Statements:");
        for (Customer c : customers) {
            System.out.println("Customer: " + c.getName());
            System.out.println("Transactions:");
            for (Double amount : c.getTransactions()) {
                double transaction = amount;
                System.out.println("  " + transaction);
            }
            System.out.println();
        }
    }
}
