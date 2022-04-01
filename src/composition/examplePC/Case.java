package composition.examplePC;

public class Case {

    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String manufacturer, String powerSupply, Dimensions dimensions) {
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public String getPowerSupply() {
        return powerSupply;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}
