package section10.javaGenerics.teamAndPlayerExample;

public class Main {

    public static void main(String[] args) {
        FootballPlayer footballPlayer1 = new FootballPlayer("Vic");
        BaseballPlayer baseballPlayer1 = new BaseballPlayer("Joe");
        SoccerPlayer soccerPlayer1 = new SoccerPlayer("Pepe");

        Team<FootballPlayer> footballTeam = new Team<>("Football Team");
        footballTeam.addPlayer(footballPlayer1);
        // to da errory, jako że ta instancja do klasy 'Team' przyjmuje parametr typu 'FootballPlayer'
//        footballTeam.addPlayer(baseballPlayer1);
//        footballTeam.addPlayer(soccerPlayer1);

        System.out.println(footballTeam.getNumOfPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Baseball Team");
        baseballTeam.addPlayer(baseballPlayer1);

        System.out.println(baseballTeam.getNumOfPlayers());

        Team<SoccerPlayer> brokenTeam = new Team<>("broken team");
        brokenTeam.addPlayer(soccerPlayer1);

        System.out.println(brokenTeam.getNumOfPlayers());

//        footballTeam.matchResult(baseballTeam, 1, 0);
    }
}
