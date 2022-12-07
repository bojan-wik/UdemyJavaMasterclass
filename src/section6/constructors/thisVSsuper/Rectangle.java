package section6.constructors.thisVSsuper;

public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;

    // 1szy konstruktor
    public Rectangle() {
        this(0, 0); // wywołuje 2gi konstruktor
    }

    // 2gi konstruktor
    public Rectangle(int width, int height) {
        this(0, 0, width, height); // wywoułuje 3ci konstruktor
    }

    // 3ci - bazowy konstruktor
    public Rectangle(int x, int y, int width, int height) {
        // inicjalizuje fieldy
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
