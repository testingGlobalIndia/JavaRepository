package academy.learnprogramming;

import java.util.ArrayList;



public class League <T extends Team> implements Comparable<League<T>> {

    int score = 0;

    ArrayList<T> teamList = new ArrayList<>();

    public boolean addTeamToList(T team){
        if(teamList.contains(team)){
            System.out.println(team.getName() +" already is in team list ");
            return false;
        }else{
            teamList.add(team);
            return true;
        }
    }

    public int getScore(){
        return score;
    }


    @Override
    public int compareTo(League<T> team) {
       if(this.getScore() > team.getScore()){
           System.out.println("Team is greatest");
           return this.getScore();
       }else{
           System.out.println(this.getScore() + " is greatest");
           return team.getScore();
       }
    }
}
