package section6.exercises.point;

public class Point {

    private int x;
    private int y;

    public Point() {
//        System.out.println("No-arg constructor called");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
//        System.out.println("Parametrized constructor called");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        // it needs to return the distance between this Point and Point 0,0 as double.
        return Math.sqrt((0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y));
    }

    public double distance(int x, int y) {
        // it needs to return the distance between this Point and Point x,y as double.
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point point) {
        // it needs to return the distance between this Point and another Point as double.
        return Math.sqrt((point.x - this.x) * (point.x - this.x) + (point.y - this.y) * (point.y - this.y));
    }
}
