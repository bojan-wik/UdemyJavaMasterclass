package section6.constructors;

public class BankAccount {

    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNumber;

    public BankAccount() {
        this(123456789, 0.0, "Default name", "default@email.com", 123456789);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int number, double balance, String customerName, String customerEmail, int customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        System.out.println("Parametrized constructor called");
    }

    public BankAccount(String customerName, String customerEmail, int customerPhoneNumber) {
//        this.number = 987654321;
//        this.balance = 1000.0;
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhoneNumber = customerPhoneNumber;
        this(987654321, 1000.0, customerName, customerEmail, customerPhoneNumber);
    }

    public boolean depositFunds(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be > 0");
            return false;
        }
        this.balance += amount;
        System.out.println("depositFunds + " + amount);
        return true;
    }

    public boolean withdrawFunds(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be > 0");
            return false;
        }
        if (this.balance < amount) {
            System.out.println("Za mało środków na koncie");
            return false;
        }
        System.out.println("withdrawFunds - " + amount);
        this.balance -= amount;
        return true;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
