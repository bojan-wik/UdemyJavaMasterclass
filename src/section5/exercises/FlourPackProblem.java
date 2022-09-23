package section5.exercises;

public class FlourPackProblem {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(2, 1, 5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int sum = (bigCount * 5) + smallCount;
        if (sum == goal) {
            return true;
        } else if (sum > goal) {
            int remainder = goal % 5;
            if (remainder == 0) {
                return true;
            } else return ((smallCount >= goal) || (smallCount >= remainder));
        } else {
            return false;
        }
    }

//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }
//        int bigCountInKilos = bigCount * 5;
//        int smallCountInKilos = smallCount * 1;
//        return (bigCountInKilos + smallCountInKilos >= goal) && (bigCountInKilos <= goal);
//    }
}
