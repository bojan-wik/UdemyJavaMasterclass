package section8.arrays;

import java.util.Scanner;

public class Class {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int numOfValues) {
        System.out.printf("Enter %d integer values.\r", numOfValues).println();
        int[] values = new int[numOfValues];
        for (int i = 0; i < values.length; i ++ ) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] values) {
        double sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i ++) {
            System.out.printf("Element %d, typed value was %d", i, myIntegers[i]).println();
        }
        System.out.printf("The average is %.2f %n", getAverage(myIntegers)).println();
    }
}
