package javaTAU.Collections;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
//        setDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

//        System.out.println(fruits.size());
//        System.out.println(fruits);

        // looping - iterator

        Iterator<String> i = fruits.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // looping - for each loop

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // looping - for each method

        fruits.forEach(fruit -> System.out.println(fruit));
    }

    public static void listDemo() {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        System.out.println(fruits.get(2));
        System.out.println(fruits.size());
        System.out.println(fruits);
    }

    public static void queueDemo() {
        Queue<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        System.out.println(fruits.size());
        System.out.println(fruits);
    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

//        System.out.println(fruitCalories.get("apple"));
//        System.out.println(fruitCalories.size());
//        System.out.println(fruitCalories);

        // looping - entrySet()

        for (Map.Entry<String, Integer> entry : fruitCalories.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // looping - keySet()

        for (String key : fruitCalories.keySet()) {
            System.out.println(key + ": " + fruitCalories.get(key));
        }

        // looping - forEach()

        fruitCalories.forEach(
                (key, value) -> System.out.println(key + ": " + value));
    }
}
