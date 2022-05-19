package section14.exceptions;

public class Main {

    // podejście LBYL
    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    // podejście EAFP
    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException arithmeticException) {
            return 0;
        }
    }

    // bez niczego
    private static int divide(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {

        // kejs pozytywny
        System.out.println(divideLBYL(10, 5));
        System.out.println(divideEAFP(10, 5));

        // kejs negatywny
        System.out.println(divideLBYL(2, 0));
        System.out.println(divideEAFP(2, 0));
        System.out.println(divide(2, 0));
    }
}
