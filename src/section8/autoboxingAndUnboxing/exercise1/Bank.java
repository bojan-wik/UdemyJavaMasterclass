package section8.autoboxingAndUnboxing.exercise1;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branchList;

    public Bank(String name) {
        this.name = name;
        branchList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }

    private Branch findBranch(String branchName) {
        Branch searchedBranch = null;
        for (Branch branch : branchList) {
            if (branch.getBranchName().equals(branchName)) {
                searchedBranch = branch;
            }
        }
        return searchedBranch;
    }

    // Add a new branch
    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null) {
            branchList.add(new Branch(branchName));
            System.out.println("The branch '" + branchName + "' added successfully.");
            return true;
        }
        System.out.println("Error: The branch '" + branchName + "' has already been added before.");
        return false;
    }

    // Add a customer to that branch with initial transaction
    public boolean addCustomerToBranch(String branchName, String customerName, double initTransactionAmount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            return existingBranch.addCustomer(customerName, initTransactionAmount);
        }
        System.out.println("Error: The branch '" + branchName + "' does not exists.");
        return false;
    }

    // Add a transaction for an existing customer for that branch
    public boolean addTransactionToCustomerForBranch(String branchName, String customerName, double transactionAmount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            return existingBranch.addTransactionToCustomer(customerName, transactionAmount);
        }
        System.out.println("Error: The branch '" + branchName + "' does not exists.");
        return false;
    }

    public boolean showListOfCustomersForBranch(String branchName, boolean showTransactions) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            System.out.println("\nCustomers for branch '" + existingBranch.getBranchName() + "':");
            ArrayList<Customer> branchCustomers = existingBranch.getCustomerList();
            for (Customer branchCustomer : branchCustomers) {
                System.out.println(branchCustomer.getName());
                if (showTransactions) {
                    branchCustomer.showListOfTransactions();
                }
                System.out.println("----------------------------");
            }
            return true;
        }
        System.out.println("Error: The branch '" + branchName + "' does not exists.");
        return false;
    }
}
