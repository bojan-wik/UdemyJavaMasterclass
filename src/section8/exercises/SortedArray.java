package section8.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        int[] unsortedIntegers = getIntegers(3);
        printArray(unsortedIntegers);
        int[] sortedIntegers = sortIntegers(unsortedIntegers);
        printArray(sortedIntegers);
    }

    public static int[] getIntegers(int numOfValues) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[numOfValues];
        System.out.println("Enter " + numOfValues + " integers:");
        for (int i = 0; i < numOfValues; i ++) {
            integers[i] = scanner.nextInt();
        }
        return integers;
    }

    public static void printArray(int[] integers) {
        System.out.println("=============================================");
        for (int i = 0; i < integers.length; i ++) {
            System.out.println("Element " + i + " contents " + integers[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedIntegers) {
        int[] sortedIntegers = Arrays.copyOf(unsortedIntegers, unsortedIntegers.length);
//        Arrays.sort(sortedIntegers, Collections.reverseOrder());
        return sortedIntegers;
    }
}
