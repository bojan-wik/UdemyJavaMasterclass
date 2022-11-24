package section11.accessModifiers;

public class Main implements Accessible {

    public static void main(String[] args) {
        Account myAccount = new Account("My Account");
        myAccount.deposit(1000);
        myAccount.withdraw(500);
    }

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }

    @Override
    public boolean methodC() {
        return false;
    }
}
