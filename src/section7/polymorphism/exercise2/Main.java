package section7.polymorphism.exercise2;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(8, "Super fura");
        car.startEngine();

        Ford ford = new Ford(6, "Focus");
        ford.startEngine();
    }
}
