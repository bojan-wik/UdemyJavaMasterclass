package section3.PrimitiveTypes.Challange;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000 + (10 * (byteValue + shortValue + intValue));
        System.out.println(longTotal);

        short shortTotal = (short)(1000 + (10 * (byteValue + shortValue + intValue)));
        System.out.println(shortTotal);
    }
}
