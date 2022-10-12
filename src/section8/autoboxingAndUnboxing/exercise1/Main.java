package section8.autoboxingAndUnboxing.exercise1;

public class Main {

    public static void main(String[] args) {
        Bank pkoBP = new Bank("PKO BP");

        pkoBP.addBranch("Oddział Warszawa");
        pkoBP.addBranch("Oddział Poznań");

        pkoBP.addBranch("Oddział Poznań");

        pkoBP.getBranchList().get(0).addCustomer("Szaft", 100.00);
        pkoBP.getBranchList().get(0).addCustomer("Kaczyński", 50.00);

        pkoBP.getBranchList().get(0).addCustomer("Kaczyński", 50.00);
        pkoBP.getBranchList().get(1).addCustomer("Kaczyński", 50.00);

        pkoBP.getBranchList().get(0).showListOfCustomers();
        pkoBP.getBranchList().get(0).addAdditionalTransactionToCustomer("Szaft", 200.00);
        pkoBP.getBranchList().get(0).showListOfCustomers();

        pkoBP.getBranchList().get(0).addAdditionalTransactionToCustomer("Customer X", 100.00);
    }
}
