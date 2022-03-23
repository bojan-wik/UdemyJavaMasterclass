package inheritance;

// Dog - child class
public class Dog extends Animal {

    // fields (states), które są unikalne dla psów.
    // wszystkie psy je mają, ale nie wszystkie zwierzęta je mają
    private int legs;
    private boolean tail;
    private String fur;

    // constructor
    public Dog(String name, boolean brain, int weight, int legs, boolean tail, String fur) {
        // za pomocą keyworda 'super' te fieldy, które należą do parent-klasy przekazuję do jej construktora
        // istnieje możliwość zdefiniowania defaultowych wartości dla klasy 'Dog' - tutaj brain i weight
        super(name, true, 50);
        // za pomocą keyworda 'this' standardowo inicjalizuję te fieldy, które należą do tej child-klasy
        this.legs = legs;
        this.tail = tail;
        this.fur = fur;
    }

    // methods (behaviours), które są unikalne dla psów
    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }
}
