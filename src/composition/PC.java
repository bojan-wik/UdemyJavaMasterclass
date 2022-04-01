package composition;

public class PC {

    private Motherboard theMotherboard;
    private Case theCase;
    private Monitor theMonitor;

    public PC(Motherboard motherboard, Case theCase, Monitor monitor) {
        this.theMotherboard = motherboard;
        this.theCase = theCase;
        this.theMonitor = monitor;
    }

    public Motherboard getTheMotherboard() {
        return theMotherboard;
    }
    public Case getTheCase() {
        return theCase;
    }
    public Monitor getTheMonitor() {
        return theMonitor;
    }
}
