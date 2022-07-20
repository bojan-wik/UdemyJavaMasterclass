package section10.javaGenerics.teamAndPlayerExample;

public class Main {

    public static void main(String[] args) {
        BaseballPlayer baseballPlayer1 = new BaseballPlayer("Joe");
        FootballPlayer footballPlayer1 = new FootballPlayer("Vic");
        SoccerPlayer soccerPlayer1 = new SoccerPlayer("Pepe");

        Team teamA = new Team("TeamA");
        teamA.addPlayer(baseballPlayer1);
        teamA.addPlayer(footballPlayer1);
        teamA.addPlayer(soccerPlayer1);

        System.out.println(teamA.getNumOfPlayers());
    }
}
