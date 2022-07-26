package section7.polymorphism.exercise2;

public class Car {

    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public void startEngine() {
        System.out.println("Car engine is starting");
    }

    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    public void brake() {
        System.out.println("Car is braking");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
