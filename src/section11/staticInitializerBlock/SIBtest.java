package section11.staticInitializerBlock;

public class SIBtest {

    public static final String owner;

    static {
        owner = "Wik";
        System.out.println("1st static initializer block called");
    }

    public SIBtest() {
        System.out.println("Constructor called");
    }

    static {
        System.out.println("2nd static initializer block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
