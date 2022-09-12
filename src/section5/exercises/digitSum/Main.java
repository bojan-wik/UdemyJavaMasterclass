package section5.exercises.digitSum;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(-1));
        System.out.println(sumDigits(1234));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
