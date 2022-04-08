package section7.composition;

public class PC {

    private Motherboard theMotherboard;
    private Case theCase;
    private Monitor theMonitor;

    public PC(Motherboard motherboard, Case theCase, Monitor monitor) {
        this.theMotherboard = motherboard;
        this.theCase = theCase;
        this.theMonitor = monitor;
    }

//    private Motherboard getTheMotherboard() {
//        return theMotherboard;
//    }
//    private Case getTheCase() {
//        return theCase;
//    }
//    private Monitor getTheMonitor() {
//        return theMonitor;
//    }

    private void drawLogo() {
        theMonitor.drawPixelAt(1000, 500, "blue");
    }

    public void powerUp() {
        theCase.pressPowerButton();
        theMotherboard.loadProgram("Windows XP");
        drawLogo();
    }
}
