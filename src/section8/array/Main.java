package section8.array;

public class Main {

    public static void printArrayElements(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        // 1
        int[] firstArr = new int[3];
        firstArr[0] = 5;
        firstArr[1] = 10;
        firstArr[2] = 15;
//        System.out.println(firstArr[2]);

        // 2
        int[] secondArr = {100, 200, 300};
//        System.out.println(secondArr[0]);

        // 3
        int[] thirdArr = new int[3];
        for (int i = 0; i < thirdArr.length; i ++) {
            thirdArr[i] = i * 20;
        }

        printArrayElements(thirdArr);
    }
}
