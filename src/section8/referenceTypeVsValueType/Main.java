package section8.referenceTypeVsValueType;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {



//        int myIntValue = 10;
//        int anotherIntValue = myIntValue;
//
//        System.out.println("\nmyIntValue = " + myIntValue);
//        System.out.println("anotherIntValue = " + anotherIntValue);
//
//        anotherIntValue ++;
//
//        System.out.println("\nmyIntValue = " + myIntValue);
//        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("\nmyIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("\nafter 1st change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after 1st change anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("\nafter 2nd change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after 2nd change anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {

        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5};
    }
}
