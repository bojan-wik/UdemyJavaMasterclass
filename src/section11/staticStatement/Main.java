package section11.staticStatement;

public class Main {

    public static int multiplier = 5;

    public static void main(String[] args) {
//        StaticTest firstInstance = new StaticTest("1st instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumberOfInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumberOfInstances());
//
//        StaticTest thirdInstance = new StaticTest("3rd instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumberOfInstances());

        System.out.println(multiply(3));
    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
