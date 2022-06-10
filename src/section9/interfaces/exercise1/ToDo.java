package section9.interfaces.exercise1;

import java.util.ArrayList;

// Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
// with Players and Monsters, but you can create any type of classes that you want).
public class ToDo implements ISaveable {

    private String task1;
    private String task2;
    private String task3;

    // Override the toString() method for each of your classes so that they can be easily printed to enable
    // the program to be tested easier.
    @Override
    public String toString() {
        return "\ntask1: " + task1 +
                "\n task2: " + task2 +
                "\n task3: " + task3;
    }

    @Override
    public void getListOfValuesToBePopulated(ArrayList<String> list) {
        System.out.println("\nList values to be populated/saved are:");
        for (int i = 0; i < list.size(); i ++) {
            System.out.printf("item %d: %s", i, list.get(i)).println();
        }
    }

    @Override
    public void populateObjectFieldsWithValues(ArrayList<String> list) {
        this.task1 = list.get(0);
        this.task2 = list.get(1);
        this.task3 = list.get(2);
    }
}
