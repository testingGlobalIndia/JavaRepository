package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	 FootBallPlayer joe = new FootBallPlayer("Joe");
	 BaseBallPlayer pat = new BaseBallPlayer("Pat");
	 SoccerPlayer beckam = new SoccerPlayer("Beckam");

	 Team<FootBallPlayer> adeleamCoruse = new Team("Adeleam Course");
	 adeleamCoruse.addPlayer(joe);

    }
}
