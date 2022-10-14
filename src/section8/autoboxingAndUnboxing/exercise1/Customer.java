package section8.autoboxingAndUnboxing.exercise1;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactionList;

    public Customer(String name, double initTransactionAmount) {
        this.name = name;
        transactionList = new ArrayList<>();
        addTransaction(initTransactionAmount);
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double transactionAmount) {
        transactionList.add(transactionAmount);
    }

    public void showListOfTransactions() {
        for (Double transaction : transactionList) {
            System.out.println(transaction);
        }
    }
}
