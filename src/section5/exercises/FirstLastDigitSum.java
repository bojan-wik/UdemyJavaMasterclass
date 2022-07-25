package section5.exercises;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
         if (number < 0) {
             return -1;
         }
         String numberAsString = Integer.toString(number);
         char[] digits = numberAsString.toCharArray();
         int firstDigit = digits[0] - '0';
         int lastDigit = digits[digits.length - 1] - '0';
         return firstDigit + lastDigit;
    }
}
