package academy.learnprogramming;

import java.util.ArrayList;

public class Customer {

    private String name;
    private static ArrayList<Double> transactions;


    public Customer(String name, double transactions) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(transactions);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
        transactions.add(transaction);
    }
}
