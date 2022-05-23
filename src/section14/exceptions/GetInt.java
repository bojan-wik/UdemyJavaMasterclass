package section14.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetInt {

    static Scanner scanner = new Scanner(System.in);

    private static int getInt() {
        System.out.println("Enter an integer: ");
        return scanner.nextInt();
    }

    private static int getIntLBYL() {
        boolean isValid = true;
        System.out.println("Enter an integer: ");
        String input = scanner.next();
        for (int i = 0; i < input.length(); i ++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        } else {
            return 0;
        }
    }

    private static int getIntEAFP() {
        System.out.println("Enter an integer: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            return 0;
        }
    }

    public static void main(String[] args) {
//        int x = getInt();
//        int x = getIntLBYL();
        int x = getIntEAFP();

        System.out.println("x is " + x);
    }
}
