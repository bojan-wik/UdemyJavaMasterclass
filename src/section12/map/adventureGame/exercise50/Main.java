package section12.map.adventureGame.exercise50;

import section12.map.adventureGame.Location;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private Map<Integer, Location> locations;
    private Map<String, String> vocabulary;

    public Main() {
        locations = new HashMap<>();
        locations.put(0, new Location(0, "Quit", "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "Road",  "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "Hill", "You are at the top of a hill"));
        locations.put(3, new Location(3, "Building", "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "Valley", "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "Forest", "You are in the forest"));
        // 1 Road
        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("W", 2);
        // 2 Hill
        locations.get(2).addExit("N", 5);
        // 3 Building
        locations.get(3).addExit("W", 1);
        // 4 Valley
        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
        // 5 Forest
        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");
    }

    public void command() {
        Scanner scanner = new Scanner(System.in);

        int loc = 1;
        while (true) {
            System.out.println("\n" + locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word : words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.command();
    }
}
