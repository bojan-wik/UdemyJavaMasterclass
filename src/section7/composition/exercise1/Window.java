package section7.composition.exercise1;

public class Window {

    private String manufacturer;
    private boolean isItPlastic;
    private Dimensions dimensions;

    public Window(String manufacturer, boolean isItPlastic, Dimensions dimensions) {
        this.manufacturer = manufacturer;
        this.isItPlastic = isItPlastic;
        this.dimensions = dimensions;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public boolean isItPlastic() {
        return isItPlastic;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }

    public void openWindow(){
        System.out.println("Opening the window");
    }
}
