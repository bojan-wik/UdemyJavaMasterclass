package section6.constructors.thisVSsuper;

class Shape {

    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Square extends Shape {

    private int width;
    private int height;

    public Square(int x, int y) {
        this(x, y, 0, 0);
    }

    public Square(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}

class Main {

    public static void main(String[] args) {
        Square square1 = new Square(5, 5);
        Square square2 = new Square(4, 4, 3, 6);
    }
}
