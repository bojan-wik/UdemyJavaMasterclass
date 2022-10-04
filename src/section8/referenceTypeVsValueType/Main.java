package section8.referenceTypeVsValueType;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {



        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("\nmyIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue ++;

        System.out.println("\nmyIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("\nmyIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("\nafter change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));
    }
}
