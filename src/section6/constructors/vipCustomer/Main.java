package section6.constructors.vipCustomer;

public class Main {

    public static void main(String[] args) {

        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName());
        System.out.println(vipCustomer1.getCreditLimit());
        System.out.println(vipCustomer1.getEmailAddress());

        VipCustomer vipCustomer2 = new VipCustomer("Mietek", "mietek@żul.pl");
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getCreditLimit());
        System.out.println(vipCustomer2.getEmailAddress());

        VipCustomer vipCustomer3 = new VipCustomer("Wiktor", 10000000000.0, "wiktor@boss.com");
        System.out.println(vipCustomer3.getName());
        System.out.println(vipCustomer3.getCreditLimit());
        System.out.println(vipCustomer3.getEmailAddress());
    }
}
