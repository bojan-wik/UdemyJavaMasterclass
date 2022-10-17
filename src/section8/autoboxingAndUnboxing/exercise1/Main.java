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

        pkoBP.addBranch("Poznań");

        pkoBP.addCustomerToBranch("Poznań", "Wiktor", 100);
        pkoBP.addCustomerToBranch("Poznań", "Asia", 150);

        pkoBP.addBranch("Warszawa");
        pkoBP.addCustomerToBranch("Warszawa", "Szaft", 75);

        pkoBP.addTransactionToCustomerForBranch("Poznań", "Wiktor", 25);
        pkoBP.addTransactionToCustomerForBranch("Poznań", "Asia", 500);

        pkoBP.showListOfCustomersForBranch("Poznań", true);

        pkoBP.addCustomerToBranch("Wrocław", "Pucek", 1000);
        pkoBP.addBranch("Poznań");
        pkoBP.addTransactionToCustomerForBranch("Poznań", "Mikaz", 250);
        pkoBP.addCustomerToBranch("Poznań", "Wiktor", 500000);
    }
}
