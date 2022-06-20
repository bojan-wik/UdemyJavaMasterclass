package section9.interfaces.exercise1.solutionfromcourse;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        ISaveable player = new Player("Wiktor", 100, 75);
//        System.out.println(player.toString());
//        saveObject(player);
//
//        player.setHitPoints(50);
//        System.out.println(player);
//        player.setWeapon("Shurikens");
//        saveObject(player);
//        loadObject(player);
//        System.out.println(player);

        ISaveable monster = new Monster("Ork", 25, 35);
        System.out.println(monster);
        saveObject(monster);
        loadObject(monster);
        System.out.println(monster);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("\nChoose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        System.out.println("===================================");
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i ++) {
            System.out.printf("Saving %s to storage device\n", objectToSave.write().get(i));
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
