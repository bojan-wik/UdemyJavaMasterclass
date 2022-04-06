package encapsulation.exercise1;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(80, true);

        System.out.println("Initial page count: " + printer.getPagesPrinted());

//        System.out.println(printer.getCurrentTonerLevel());
//        printer.addToner(10);
//        System.out.println(printer.getCurrentTonerLevel());
        
        printer.printPages(4);
        System.out.println(printer.getPagesPrinted());
    }
}
