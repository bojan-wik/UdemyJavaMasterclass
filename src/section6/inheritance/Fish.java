package section6.inheritance;

public class Fish extends Animal {

    private int fins;
    private int gills;

    public Fish(String name, int fins, int gills) {
        super(name, true, 2);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        System.out.println("Fish.swim() called");
        moveBackFin();
        super.move(speed);
    }
}
