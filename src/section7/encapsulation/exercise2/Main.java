package section7.encapsulation.exercise2;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("Initial page count = " + printer.getPagesPrinted());
    }
}
