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
        return String.format("%s -> startEngine()", getClass().getSimpleName());
    }
    public String accelerate() {
        return String.format("%s -> accelerate()", getClass().getSimpleName());
    }
    public String brake() {
        return String.format("%s -> brake()", getClass().getSimpleName());
    }
}

class Skoda extends Car {
    public Skoda() {
        super("Skoda", 3);
    }

    @Override
    public String startEngine() {
        return String.format("%s -> startEngine()", getClass().getSimpleName());
    }
    @Override
    public String accelerate() {
        return String.format("%s -> accelerate()", getClass().getSimpleName());
    }
    @Override
    public String brake() {
        return String.format("%s -> brake()", getClass().getSimpleName());
    }
}

class AlfaRomeo extends Car {
    public AlfaRomeo() {
        super("Alfa Romeo", 5);
    }

    @Override
    public String startEngine() {
        return String.format("%s -> startEngine()", getClass().getSimpleName());
    }
    @Override
    public String accelerate() {
        return String.format("%s -> accelerate()", getClass().getSimpleName());
    }
    @Override
    public String brake() {
        return String.format("%s -> brake()", getClass().getSimpleName());
    }
}

class Opel extends Car {
    public Opel() {
        super("Opel", 7);
    }

    @Override
    public String startEngine() {
        return String.format("%s -> startEngine()", getClass().getSimpleName());
    }
    @Override
    public String accelerate() {
        return String.format("%s -> accelerate()", getClass().getSimpleName());
    }
    @Override
    public String brake() {
        return String.format("%s -> brake()", getClass().getSimpleName());
    }
}

class Main {

    public static void main(String[] args) {

        Car car = new Car("Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Skoda skoda = new Skoda();
        System.out.println(skoda.startEngine());
        System.out.println(skoda.accelerate());
        System.out.println(skoda.brake());

        AlfaRomeo alfaRomeo = new AlfaRomeo();
        System.out.println(alfaRomeo.startEngine());
        System.out.println(alfaRomeo.accelerate());
        System.out.println(alfaRomeo.brake());

        Opel opel = new Opel();
        System.out.println(opel.startEngine());
        System.out.println(opel.accelerate());
        System.out.println(opel.brake());
    }
}