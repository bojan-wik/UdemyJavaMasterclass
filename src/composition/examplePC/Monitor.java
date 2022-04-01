package composition.examplePC;

public class Monitor {

    private String manufacturer;
    private int size;
    private Resolution nativeResolution;
    // przykład kompozycji - klasa 'Resolution' jest częścią klasy 'Monitor',
    // monitor nie jest rodzielczością - monitor ma rozdzielczość

    public Monitor(String manufacturer, int size, Resolution nativeResolution) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public int getSize() {
        return size;
    }
    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.printf("Drawing pixel at %d, %d in color %s", x, y, color).println();
    }
}
