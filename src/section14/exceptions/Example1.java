package section14.exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (NoSuchElementException | ArithmeticException exception) {
            System.out.println(exception.toString());
            System.out.println("Unable to perform division, autopilot shutting down");
        }
    }

    private static int divide() {
        int x, y;
        try {
            x = getInt();
            y = getInt();
            System.out.printf("x is %d, y is %d", x, y).println();
            return x / y;
        } catch (NoSuchElementException exception) {
            throw new NoSuchElementException("no suitable input");
        } catch (ArithmeticException exception) {
            throw new ArithmeticException("attempt to divide by zero");
        }
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException exception) {
                // go round again; read past the end of line in the input first
                scanner.nextLine();
                System.out.println("Enter a number using only the digits 0 to 9");
            }
        }
    }
}
