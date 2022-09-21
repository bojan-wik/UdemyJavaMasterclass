package section6.constructors;

public class Main {

    public static void main(String[] args) {

//        BankAccount myBankAccount = new BankAccount(
//                1212312431 ,
//                1000.0,
//                "Wiktor",
//                "wiktor@boss.com",
//                123456789);

//        BankAccount myBankAccount = new BankAccount();

        BankAccount myBankAccount = new BankAccount("Ziutek", "ziutek@wp.pl", 612918050);

        System.out.println(myBankAccount.getCustomerName());

        System.out.println("Balance: " + myBankAccount.getBalance());
        myBankAccount.withdrawFunds(1500);
        myBankAccount.depositFunds(2500);
        System.out.println("Balance: " + myBankAccount.getBalance());
        myBankAccount.withdrawFunds(1500);
        System.out.println("Balance: " + myBankAccount.getBalance());
    }
}
