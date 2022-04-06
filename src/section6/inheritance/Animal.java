package section6.inheritance;

// Animal - parent class
public class Animal {

    // fields (states), które są obecne u wszystkich zwierząt
    private String name;
    private boolean brain;
    private int weight;

    // constructor
    public Animal(String name, boolean brain, int weight) {
        this.name = name;
        this.brain = brain;
        this.weight = weight;
    }

    // getters
    public String getName() {
        return name;
    }

    public boolean getBrain() {
        return brain;
    }

    public int getWeight() {
        return weight;
    }

    // methods (behaviours) które są obecne u wszystkich zwierząt
    public void move(int speed) {
        System.out.println("Animal.move() called. Animal is moving at " + speed);
    }

    public void eat() {
        System.out.println("Animal.eat() called");
    }
}
