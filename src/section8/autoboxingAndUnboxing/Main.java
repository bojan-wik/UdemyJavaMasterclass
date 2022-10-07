package section8.autoboxingAndUnboxing;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] stringArray = new String[5];
        int[] intArray = new int[5];

        ArrayList<String> stringArrayList = new ArrayList<>();

//        ArrayList<int> intArrayList = new ArrayList<int>();

        Integer integer = new Integer(5);
        Double myDouble = new Double(5.0);
        String myString = new String("elo");

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 1; i <= 5; i ++) {
            integerArrayList.add(i);
        }

//        System.out.println(integerArrayList);
        for (int i = 1; i < 5; i ++) {
            System.out.println("i = " + integerArrayList.get(i).intValue());
        }

        Integer myInteger = 56;  // = Integer.valueOf(56);
        int myInt = myInteger;   // = myInteger.intValue()
    }
}
