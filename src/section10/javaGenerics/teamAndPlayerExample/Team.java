package section10.javaGenerics.teamAndPlayerExample;

import java.util.ArrayList;

public class Team<T extends Player> {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumOfPlayers() {
        return members.size();
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println("Player " + (player.getName() +  " is already on the team " + this.getName()));
            return false;
        }
        members.add(player);
        System.out.println("Adding player " + (player.getName() + " to the team " + this.getName()));
        return true;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        played += 1;
        if (ourScore > theirScore) {
            won += 1;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied += 1;
            message = " drew with ";
        } else {
            lost += 1;
            message = " lost to ";
        }
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}
