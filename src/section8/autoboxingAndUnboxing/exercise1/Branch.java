package section8.autoboxingAndUnboxing.exercise1;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customerList;

    public Branch(String branchName) {
        this.branchName = branchName;
        customerList = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    private Customer findCustomer(String customerName) {
        Customer searchedCustomer = null;
        for (Customer customer : customerList) {
            if (customer.getName().equals(customerName)) {
                searchedCustomer = customer;
            }
        }
        return searchedCustomer;
    }

    public boolean addCustomer(String customerName, double initTransactionAmount) {
        if (findCustomer(customerName) == null) {
            customerList.add(new Customer(customerName, initTransactionAmount));
            System.out.println("The customer '" + customerName + "' added successfully to the branch '" + branchName + "'.");
            return true;
        }
        System.out.println("Error: The customer '" + customerName + "' is already in the branch '" + branchName + "'.");
        return false;
    }

    public boolean addTransactionToCustomer(String customerName, double transactionAmount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(transactionAmount);
            return true;
        }
        System.out.println("Error: The customer '" + customerName +"' is not in the branch '" + branchName + "'.");
        return false;
    }

    public void showListOfCustomers() {
        System.out.println("\nCustomers list:" +
                "\n----------------------------");
        for (int i = 0; i < customerList.size(); i ++) {
            System.out.println(customerList.get(i).getName() + ": ");
            customerList.get(i).showListOfTransactions();
        }
        System.out.println("----------------------------");
    }
}
