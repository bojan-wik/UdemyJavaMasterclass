package section8.arrays.exercise1;

import java.util.Scanner;
import java.util.Arrays;

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
        System.out.println("-----------------------------------------------");
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i ++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(3);
        printArray(myIntegers);
        int[] myIntegersSorted = sortIntegers(myIntegers);
        printArray(myIntegersSorted);
    }
}
