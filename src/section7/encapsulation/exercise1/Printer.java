package section7.encapsulation.exercise1;

public class Printer {

    private final int minTonerLever = 0;
    private final int maxTonerLevel = 100;
    private int currentTonerLevel = 0;
    private int pagesPrinted;
    private boolean isItDuplexPrinter;

    public Printer(int currentTonerLevel, boolean isItDuplexPrinter) {
        if (currentTonerLevel >= minTonerLever && currentTonerLevel <= maxTonerLevel) {
            this.currentTonerLevel = currentTonerLevel;
        } else {
            this.currentTonerLevel = -1;
        }
        this.isItDuplexPrinter = isItDuplexPrinter;
        this.pagesPrinted = 0;
    }

    public int getCurrentTonerLevel() {
        return currentTonerLevel;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }
    public boolean isItDuplexPrinter() {
        return isItDuplexPrinter;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (currentTonerLevel + tonerAmount > maxTonerLevel) {
                return -1;
            }
            currentTonerLevel += tonerAmount;
            return currentTonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = (pages/2) + (pages % 2);
        if (isItDuplexPrinter) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        pagesPrinted += pages;
        return pagesToPrint;
    }
}
