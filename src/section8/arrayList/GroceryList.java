package section8.arrayList;

import java.util.ArrayList;

public class GroceryList {
    private static final ArrayList<String> groceryList = new ArrayList<String>();

    public static void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public static void printGroceryList() {
        System.out.printf("\nYou have %d items in your grocery list", groceryList.size()).println();
        for (int i = 0; i < groceryList.size(); i ++) {
            System.out.printf("\tItem %d: %s", i, groceryList.get(i)).println();
        }
    }

    public static void modifyGroceryItem(int index, String newItem) {
        groceryList.set(index, newItem);
    }

    public static void removeGroceryItem(int index) {
        String theItem = groceryList.get(index);
        groceryList.remove(index);
        System.out.printf("\nItem %s has been removed from the grocery list", theItem).println();
    }

    public String findItem(String searchedItem) {
//        boolean exists = groceryList.contains(searchedItem);
        int position = groceryList.indexOf(searchedItem);
        if (position >= 0) {
            return groceryList.get(position);
        } else {
            return null;
        }
    }
}
