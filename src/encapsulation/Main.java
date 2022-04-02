package encapsulation;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Forwe";
//        player.health = 20;
//        player.weapon = "Morgenstern";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.printf("Remaining health = %d", player.healthRemaining()).println();
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.printf("Remaining health = %d", player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Victorious", 50, "Axe");
        System.out.printf("Initial health is %s", enhancedPlayer.getHitPoints()).println();
    }
}
