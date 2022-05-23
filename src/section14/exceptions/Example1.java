package section14.exceptions;

import java.util.Scanner;

public class Example1 {

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        return scanner.nextInt();
    }

    private static int divide() {
        int x = getInt();
        int y = getInt();
        System.out.printf("x is %d, y is %d", x, y).println();
        return x / y;
    }

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }
}
