package section8.arrays.exercise1;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int numOfValues) {
        System.out.printf("Enter %d integer values\r", numOfValues).println();
        int[] values = new int[numOfValues];
        for (int i = 0; i < values.length; i ++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            System.out.printf("index %d, value is %d", i, array[i]).println();
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        // kod sortowania
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        sortIntegers(myIntegers);
    }
}
