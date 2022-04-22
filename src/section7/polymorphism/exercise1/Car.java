package section7.polymorphism.exercise1;

// We are going to go back to the car analogy.
// 1. Create a base class called Car - OK
// 2. It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc. - OK
// 3. Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters. - OK
//
// 4. Create appropriate getters - ...
//
// 5. Create some methods like startEngine, accelerate, and brake
// show a message for each in the base class - ...
// 6. Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

import section7.polymorphism.*;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }
    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car - starting engine";
    }
    public String accelerate() {
        return "Car - accelerating";
    }
    public String brake() {
        return "Car - braking";
    }
}

class Skoda extends Car {
    public Skoda() {
        super("Skoda", 3);
    }

    @Override
    public String startEngine() {
        return "Skoda - starting engine";
    }
    @Override
    public String accelerate() {
        return "Skoda - accelerating";
    }
    @Override
    public String brake() {
        return "Skoda - braking";
    }
}

class AlfaRomeo extends Car {
    public AlfaRomeo() {
        super("Alfa Romeo", 5);
    }

    @Override
    public String startEngine() {
        return "Alfa Romeo - starting engine";
    }
    @Override
    public String accelerate() {
        return "Alfa Romeo - accelerating";
    }
    @Override
    public String brake() {
        return "Alfa Romeo - braking";
    }
}

class Opel extends Car {
    public Opel() {
        super("Opel", 7);
    }

    @Override
    public String startEngine() {
        return "Opel - starting engine";
    }
    @Override
    public String accelerate() {
        return "Opel - accelerating";
    }
    @Override
    public String brake() {
        return "Opel - braking";
    }
}

class Main {

    public static Car randomCar() {
        int randomNumber = (int)(Math.random() * 3) + 1;
        System.out.printf("\nGenerated number: %d", randomNumber).println();
        switch (randomNumber) {
            case 1:
                return new Skoda();
            case 2:
                return new AlfaRomeo();
            case 3:
                return new Opel();
        }
        return null;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i ++) {
            Car car = randomCar();
            System.out.printf("Car #%d: '%s'", i, car.getName()).println();
            System.out.println(car.startEngine());
            System.out.println(car.accelerate());
            System.out.println(car.brake());
        }
    }
}