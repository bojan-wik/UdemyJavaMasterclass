package inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal("Animal-1", true, 25);
//        System.out.println(animal1.getWeight());

        Dog dog1 = new Dog("Mops", true, 15, 4, true, "nice fur");
//        System.out.println(dog1.getName());
//        dog1.eat();
//        dog1.walk();

        Fish fish = new Fish("Karpik", 4, 2);
    }
}
