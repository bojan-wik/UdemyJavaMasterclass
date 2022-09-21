package section6.constructors.vipCustomer;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", 0000.00, "default@email.com");
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 9999.99, emailAddress);
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        System.out.println("---------Calling the default constructor----------");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
