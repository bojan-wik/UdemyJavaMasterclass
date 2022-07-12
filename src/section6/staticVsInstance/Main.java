package section6.staticVsInstance;

public class Main {

    public static void main(String[] args) {

//        Calculator.printSum(3, 5);
//        printHello();

        Dog rex = new Dog("Rex");
        Dog fluffy = new Dog("Fluffy");

        rex.printName();
        fluffy.printName();
    }

//    public static void printHello() {
//        System.out.println("hello");
//    }
}
