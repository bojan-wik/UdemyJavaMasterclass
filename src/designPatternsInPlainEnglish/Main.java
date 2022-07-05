package designPatternsInPlainEnglish;

public class Main {

    public static void main(String[] args) {
//        User user = new User("Wiktor");
//        user.sayHello();

//        TaxCalculator calculator = getCalculator();
//        System.out.println(calculator.calculateTax());

//        BankAccount bankAccount = new BankAccount();
//        bankAccount.deposit(100);
//        System.out.println(bankAccount.getBalance());
//        bankAccount.withdraw(25);
//        System.out.println(bankAccount.getBalance());

        drawUIControl(new TextBox());
        drawUIControl(new Checkbox());
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}
