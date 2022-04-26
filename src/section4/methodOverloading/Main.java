package section4.methodOverloading;

public class Main {

    public static int calculateScore(String playerName, int score) {
        System.out.printf("Player %s scored %d", playerName, score).println();
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.printf("Unnamed Player scored %d", score).println();
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.printf("No player name, no player score").println();
        return 0;
    }

    public static void main(String[] args) {
        calculateScore("Wiktor", 500);
        calculateScore(100);
        calculateScore();
    }
}
