package section8.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Adelaide");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Melbourne");

        printList(placesToVisit);
        addInOrderAZ(placesToVisit, "Cyce");
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===============================");
    }

    private static boolean addInOrderAZ(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int comparison = listIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add
                System.out.printf("%s is already on the list", newCity);
                return false;
            } else if (comparison > 0) {
                // not equal, add before
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // not equal, move on next city
            }
        }
        listIterator.add(newCity);
        return true;
    }
}