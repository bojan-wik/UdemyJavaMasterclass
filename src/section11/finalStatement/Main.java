package section11.finalStatement;

public class Main {

    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//
//        System.out.println(SomeClass.getClassCounter());
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());

        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();

        password.logIn(1);
        password.logIn(1234);

        password.logIn(674312);
    }
}
