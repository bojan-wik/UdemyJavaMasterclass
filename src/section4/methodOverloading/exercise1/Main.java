package section4.methodOverloading.exercise1;

public class Main {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            return ((feet * 12) + inches) * 2.54;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            //code
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6, 10));
    }
}
