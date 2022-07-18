package section10.javaGenerics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // bez używania Java Generics
        // ArrayList bez sprecyzowanego jako parametr typy danych przechowywanych w liście (raw type)
        ArrayList itemsOfRawType = new ArrayList();
        itemsOfRawType.add(1);
        itemsOfRawType.add(2);
        itemsOfRawType.add(3);
        itemsOfRawType.add("hello world");

//        printDoubledRawType(itemsOfRawType);

        // z użyciem Java Generics
        // ArrayList z sprecyzowanym jako parametr typem danych przechowywanych w liście (parametrized type)
        ArrayList<Integer> itemsOfParametrizedType = new ArrayList<>();
        itemsOfParametrizedType.add(1);
        itemsOfParametrizedType.add(2);
        itemsOfParametrizedType.add(3);
//        itemsOfParametrizedType.add("hello world");

        printDoubledRawType(itemsOfParametrizedType);
    }

    public static void printDoubledRawType(ArrayList items) {
        for (Object item : items) {
            System.out.println(((Integer) item * 2));
        }
    }

    public static void printDoubledParametrizedType(ArrayList<Integer> items) {
        for (Integer item : items) {
            System.out.println((item * 2));
        }
    }
}
