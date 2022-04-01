package composition.exampleRoom;

public class Lamp {

    private String manufacturer;
    private String powerSupply;
    private int lengthOfWire;

    public Lamp(String manufacturer, String powerSupply, int lengthOfWire) {
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.lengthOfWire = lengthOfWire;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public String getPowerSupply() {
        return powerSupply;
    }
    public int getLengthOfWire() {
        return lengthOfWire;
    }

    public void turnLampOn() {
        System.out.println("Lamp is turned on");
    }
}
