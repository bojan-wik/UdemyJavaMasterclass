package section7.composition;

public class Motherboard {

    private String manufacturer;
    private int ramSlots;
    private String bios;

    public Motherboard(String manufacturer, int ramSlots, String bios) {
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public int getRamSlots() {
        return ramSlots;
    }
    public String getBios() {
        return bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }
}
