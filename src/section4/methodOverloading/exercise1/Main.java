package section4.methodOverloading.exercise1;

public class Main {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double centimeters = ((feet * 12) + inches) * 2.54;
            System.out.printf("%.2f feet, %.2f inches = %.2f cm", feet, inches, centimeters).println();
            return centimeters;
        } else {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int)inches / 12;
            double remainingInches = (int)inches % 12;
            System.out.printf("%.2f inches = %.2f feet, %.2f inches", inches, feet, remainingInches).println();
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(100);
    }
}
