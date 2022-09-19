package section5.exercises.sharedDigit;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (!((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99))) {
            return false;
        }
        int number1Digit1 = number1 / 10;
        int number1Digit2 = number1 % 10;
        int number2Digit1 = number2 / 10;
        int number2Digit2 = number2 % 10;
        return (number1Digit1 == number2Digit1 || number1Digit1 == number2Digit2 ||
                number1Digit2 == number2Digit1 || number1Digit2 == number2Digit2);
    }
}
