package section8.autoboxingAndUnboxing.exercise1;

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

public class Main {

    public static void main(String[] args) {
        Bank pkoBP = new Bank("PKO BP");

        pkoBP.addBranch("Oddział Warszawa");

        pkoBP.addCustomerToBranch("Oddział Poznań", "Wiktor", 1000);
        pkoBP.addBranch("Oddział Poznań");
        pkoBP.addCustomerToBranch("Oddział Poznań", "Wiktor", 1000);
        pkoBP.addCustomerToBranch("Oddział Poznań", "Wiktor", 1000);

//        pkoBP.addBranch("Oddział Poznań");

//        pkoBP.getBranchList().get(0).addCustomer("Szaft", 100.00);
//        pkoBP.getBranchList().get(0).addCustomer("Kaczyński", 50.00);
//
//        pkoBP.getBranchList().get(0).addCustomer("Kaczyński", 50.00);
//        pkoBP.getBranchList().get(1).addCustomer("Kaczyński", 50.00);
//
//        pkoBP.getBranchList().get(0).showListOfCustomers();
//        pkoBP.getBranchList().get(0).addTransactionToCustomer("Szaft", 200.00);
//        pkoBP.getBranchList().get(0).showListOfCustomers();
//
//        pkoBP.getBranchList().get(0).addTransactionToCustomer("Customer X", 100.00);
    }
}
