package section8.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Melbourne");

        addInOrderAZ(placesToVisit, "Sydney");
        addInOrderAZ(placesToVisit, "Melbourn");
        addInOrderAZ(placesToVisit, "Brisbane");
        printList(placesToVisit);
        addInOrderAZ(placesToVisit, "Sydney");
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

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("List of cities is empty");
            return;
        } else {
            System.out.printf("Now visiting %s\n", listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over :(");
                    quit = true;
                    break;
                case 1:
                    if (listIterator.hasNext()) {
                        System.out.printf("Now visition %s\n", listIterator.next());
                    } else {
                        System.out.println("We are at the end of the list");
                    }
                    break;
                case 2:
                    if (listIterator.hasPrevious()) {
                        System.out.printf("Now visition %s\n", listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available options:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}