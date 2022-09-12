package section5.whileAndDoWhileLoops;

public class Main {

    public static void main(String[] args) {

//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count ++;
//        }

//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count ++;
//        } while(count != 6);

//        int number = 0;
//
//        while (number <= 10) {
//            number ++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number: " + number);
//        }

        int number = 0;
        int evenNumbersCount = 0;

        while (number <= 20) {
            number ++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number: " + number);
            evenNumbersCount ++;
            if (evenNumbersCount >= 5) {
                break;
            }
        }
        System.out.println("\nEven numbers count: " + evenNumbersCount);
    }

    static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
