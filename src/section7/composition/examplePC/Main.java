package section7.composition.examplePC;

public class Main {

    public static void main(String[] args) {
        // kupuję moje części do mojego PCta: obudowę, płytę główną, monitor
        Case myCase = new Case("HP", "240V", new Dimensions(20, 20, 5));
        Motherboard myMotherboard = new Motherboard("Intel", 4, "v2.44");
        Monitor myMonitor = new Monitor("Dell", 22, new Resolution(1920, 1080));

        // składam mojego PCta z zakupionych części
        PC myPC = new PC(myMotherboard, myCase, myMonitor);
//        myPC.getTheCase().pressPowerButton();
//        myPC.getTheMotherboard().loadProgram("Windows 10");
//        myPC.getTheMonitor().drawPixelAt(1200, 1500, "blue");
        // do metod zdefiniowanych w base-klasach (Case, Motherboard, Monitor) dostaję się pośrednio przez obiekt myPC
        myPC.powerUp();
    }
}
