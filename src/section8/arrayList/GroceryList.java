package section8.arrayList;

import java.util.ArrayList;

public class GroceryList {

    private static final ArrayList<String> groceryList = new ArrayList<String>();

    public static void main(String[] args) {
        printGroceryList();
        addGroceryItem("Pietrucha");
        addGroceryItem("Marcheweczka");
        printGroceryList();
        modifyGroceryItem(0, "Szczypiorek");
        printGroceryList();
        removeGroceryItem(0);
        printGroceryList();
    }

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
}
