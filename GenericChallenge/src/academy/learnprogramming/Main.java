package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        HockeyTeam hockeyTeam = new HockeyTeam("hello");
        CricketTeam cricketTeam = new CricketTeam("India");

        League<HockeyTeam> hockeyTeamLeague = new League<>();
        hockeyTeamLeague.addTeamToList(hockeyTeam);

    }
}
