package section10.javaGenerics.teamAndPlayerExample;

import java.util.ArrayList;

public class Team {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumOfPlayers() {
        return members.size();
    }

    public boolean addPlayer(Player player) {
        if (members.contains(player)) {
            System.out.println("Player " + player.getName() +  " is already on the team " + this.getName());
            return false;
        }
        members.add(player);
        System.out.println("Adding player " + player.getName() + " to the team " + this.getName());
        return true;
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        played += 1;
        if (ourScore > theirScore) {
            won += 1;
        } else if (ourScore == theirScore) {
            tied += 1;
        } else {
            lost += 1;
        }
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}
